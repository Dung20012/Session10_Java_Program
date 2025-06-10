package homeword.Exercise05;

import java.util.ArrayList;

public class InvoiceManager implements Manage<Invoice>{
    private ArrayList<Invoice> invoices;

    public InvoiceManager(){
        invoices = new ArrayList<>();
    }

    @Override
    public void add(Invoice item) {
        invoices.add(item);
    }

    @Override
    public void update(int index, Invoice item) {
        if (index >= 0 && index < invoices.size()){
            invoices.set(index,item);
        }
    }

    @Override
    public void delete(int index) {
        if (index >= 0 && index < invoices.size()){
            invoices.remove(index);
        }
    }

    @Override
    public void display() {
        if (invoices.isEmpty()){
            System.out.println("Danh sách hóa đơn trống");
        }else {
            for (int i = 0; i < invoices.size(); i++){
                System.out.println((i + 1) + "." + invoices.get(i));
            }
        }
    }

//    Tìm vị trí hóa đơn theo mã
    public int findIndexByCode(String code){
        for (int i = 0; i < invoices.size(); i++){
            if (invoices.get(i).getCode().equals(code)){
                return i;
            }
        }
        return -1;
    }
//    Tìm vị trí id theo mã id
    public int findIndexById(int id){
        for (int i = 0; i < invoices.size(); i++){
            if (invoices.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
//    Kiểm tra mã hóa đơn đã tồn tại
    public boolean exists(String code){
        return findIndexByCode(code) != -1;
    }
//    Getter để truy cập danh sách Main
    public ArrayList<Invoice> getInvoices(){
        return invoices;
    }
}
