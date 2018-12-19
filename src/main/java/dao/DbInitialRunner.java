package dao;

import dao.metamodel.enteties.ObjectType;
import dao.metamodel.repositories.ObjectTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class DbInitialRunner implements CommandLineRunner {
    @Autowired
    private ObjectTypeRepository objectTypeRepository;
    private List<String> tableNames = Arrays.asList("User");
    @Override
    public void run(String... args) throws Exception {
        initObjectTypes();
    }

    private void initObjectTypes() {
        tableNames.forEach(tableName -> objectTypeRepository.save(new ObjectType(tableName)));
    }
}
