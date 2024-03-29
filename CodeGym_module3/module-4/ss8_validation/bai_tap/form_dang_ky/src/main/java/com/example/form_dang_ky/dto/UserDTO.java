//package com.example.form_dang_ky.dto;
//
//import jakarta.validation.constraints.Min;
//import jakarta.validation.constraints.Pattern;
//import org.springframework.validation.Errors;
//import org.springframework.validation.Validator;
//
//public class UserDTO implements Validator {
//    private String firstName;
//    private String lastName;
//    @Pattern(regexp = "^\\s*(?:\\+?(\\d{1,3}))?([-. (]*(\\d{3})[-. )]*)?((\\d{3})[-. ]*(\\d{2,4})(?:[-.x ]*(\\d+))?)\\s*$", message = "Không đúng ký tự")
//    private String phoneNumber;
//    @Min(value = 18, message = "Tuổi phải lớn hơn 18")
//    private String age;
//    @Pattern(regexp = "([\\w\\.\\-_]+)?\\w+@[\\w-_]+(\\.\\w+){1,}", message = "Không đúng định dạng")
//    private String email;
//
//    public UserDTO() {
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    @Override
//    public boolean supports(Class<?> clazz) {
//        return false;
//    }
//
//    @Override
//    public void validate(Object target, Errors errors) {
//        UserDTO userDTO = (UserDTO) target;
//        if (userDTO.getFirstName().length() <= 5 || userDTO.getFirstName().length() >= 45) {
//            errors.rejectValue("firstName", null, "số lượng ký tự phải lớn hơn 5 và nhở hơn 45");
//        }
//        if (userDTO.getLastName().length() <= 5 || userDTO.getLastName().length() >= 45) {
//            errors.rejectValue("lastName", null, "số lượng ký tự phải lớn hơn 5 và nhở hơn 45");
//        }
//    }
//}
