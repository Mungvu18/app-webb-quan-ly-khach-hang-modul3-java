package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerService implements ICustomerService {
    // tạo 1 danh sách để hấng
    static Map<Integer, Customer> customerMap;

    // tạo 1 khối static khởi tạo giá trị
    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1, "mung", "Nam Đinh"));
        customerMap.put(2, new Customer(2, "hoÀN", "Nam Đinh"));
        customerMap.put(3, new Customer(3, "HIẾU", "thái bình"));
        customerMap.put(4, new Customer(4, "duyệt", "Hà nam"));
    }

    @Override
    public List<Customer> findALl() {
        return new ArrayList<Customer>(customerMap.values());
    }

    @Override
    public Customer save(int id, Customer customer) {
        return customerMap.put(id,customer);
    }

    @Override
    public void delete(int id) {
        customerMap.remove(id);
    }

    @Override
    public Customer editByID(int id, Customer customer) {
        return customerMap.replace(id,customer);
    }

    @Override
    public Customer findById(int id) {
        return customerMap.get(id);
    }
}
