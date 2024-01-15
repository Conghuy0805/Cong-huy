package Thi2.repository;

import Thi2.model.PhoneXachTay;

import java.util.ArrayList;

public interface IPhoneRepoXT {
    ArrayList<PhoneXachTay> readfile();

    ArrayList<PhoneXachTay> writefile(ArrayList<PhoneXachTay> phoneXachTays);
}
