package Thi2.repository;

import Thi2.model.PhoneXachTay;
import Thi2.until.ReadFileXT;
import Thi2.until.WriteFileXT;

import java.util.ArrayList;

public class PhoneXTRepo implements IPhoneRepoXT {
    @Override
    public ArrayList<PhoneXachTay> readfile() {
        return ReadFileXT.readfileXT();
    }

    @Override
    public ArrayList<PhoneXachTay> writefile(ArrayList<PhoneXachTay> phoneXachTays) {
        return WriteFileXT.writefile(phoneXachTays);
    }
}
