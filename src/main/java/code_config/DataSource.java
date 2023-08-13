package code_config;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
