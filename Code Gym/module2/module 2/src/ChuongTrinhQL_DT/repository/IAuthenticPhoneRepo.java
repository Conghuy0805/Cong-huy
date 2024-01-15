package ChuongTrinhQL_DT.repository;

import ChuongTrinhQL_DT.model.AuthenticPhone;

import java.util.ArrayList;

public interface IAuthenticPhoneRepo {
    ArrayList<AuthenticPhone> readFile();
    ArrayList<AuthenticPhone> writeFile(ArrayList<AuthenticPhone> authenticPhones);
}
