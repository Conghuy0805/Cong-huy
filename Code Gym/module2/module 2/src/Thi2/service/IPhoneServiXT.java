package Thi2.service;

import Thi2.Exeption.NotFoundProductException;

public interface IPhoneServiXT {
    void display();
    void add();
    void delete(int id);
    void seachById(int id);
    void searchByMaSP(String maSP) throws NotFoundProductException;
}
