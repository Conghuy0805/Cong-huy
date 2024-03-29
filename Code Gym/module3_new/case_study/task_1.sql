create database case_study;

use case_study;

create table vi_tri(
	ma_vi_tri int auto_increment,
    ten_vi_tri varchar(45),
    primary key(ma_vi_tri)
);

create table trinh_do(
	ma_trinh_do int auto_increment,
    ten_trinh_do varchar(45),
    primary key(ma_trinh_do)
);

create table bo_phan(
	ma_bo_phan int auto_increment,
    ten_bo_phan varchar(45),
    primary key(ma_bo_phan)
);

create table nhan_vien(
	ma_nhan_vien int auto_increment,
    ho_ten varchar(45),
    ngay_sinh date,
    so_cmnd varchar(45),
    luong double,
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    ma_vi_tri int,
    ma_trinh_do int,
    ma_bo_phan int,
    primary key(ma_nhan_vien),
    foreign key(ma_vi_tri) references vi_tri(ma_vi_tri),
    foreign key(ma_trinh_do) references trinh_do(ma_trinh_do),
    foreign key(ma_bo_phan) references bo_phan(ma_bo_phan)
);

create table loai_khach(
	ma_loai_khach int auto_increment,
    ten_loai_khach varchar(45),
    primary key(ma_loai_khach)
);

create table khach_hang(
	ma_khach_hang int auto_increment,
    ma_loai_khach int,
    ho_ten varchar(45),
    ngay_sinh date,
    gioi_tinh bit(1),
    so_cmnd varchar(45),
    so_dien_thoai varchar(45),
    email varchar(45),
    dia_chi varchar(45),
    primary key(ma_khach_hang),
    foreign key(ma_loai_khach) references loai_khach(ma_loai_khach)
);	

create table kieu_thue(
	ma_kieu_thue int auto_increment,
    ten_kieu_thue varchar(45),
    primary key(ma_kieu_thue)
);	

create table loai_dich_vu(
	ma_loai_dich_vu int auto_increment,
    ten_loai_dich_vu varchar(45),
    primary key(ma_loai_dich_vu)
);

create table dich_vu(
	ma_dich_vu int auto_increment,
    ten_dich_vu varchar(45),
    dien_tich int,
    chi_phi_thue double,
    so_nguoi_toi_da int,
    ma_kieu_thue int,
    ma_loai_dich_vu int,
    tieu_chuan_phong varchar(45),
    mo_ta_tien_nghi_khac varchar(45),
    dien_tich_ho_boi double,
    so_tang int,
    primary key(ma_dich_vu),
    foreign key(ma_kieu_thue) references kieu_thue(ma_kieu_thue),
    foreign key(ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu)
);

create table hop_dong(
	ma_hop_dong int auto_increment,
    ngay_lam_hop_dong datetime,
    ngay_ket_thuc date,
    tien_dat_coc double,
    ma_nhan_vien int,
    ma_khach_hang int,
    ma_dich_vu int,
    primary key(ma_hop_dong),
    foreign key(ma_nhan_vien) references nhan_vien(ma_nhan_vien),
    foreign key(ma_khach_hang) references khach_hang(ma_khach_hang),
    foreign key(ma_dich_vu) references dich_vu(ma_dich_vu)
);

create table dich_vu_di_kem(
	ma_dich_vu_di_kem int auto_increment,
    ten_dich_vu_di_kem varchar(45),
    gia double,
    don_vi varchar(10),
    trang_thai varchar(45),
    primary key(ma_dich_vu_di_kem)
);	

create table hop_dong_chi_tiet(
	ma_hop_dong_chi_tiet int auto_increment,
    ma_hop_dong int,
    ma_dich_vu_di_kem int,
    so_luong int,
    primary key(ma_hop_dong_chi_tiet),
    foreign key(ma_hop_dong) references hop_dong(ma_hop_dong),
    foreign key(ma_dich_vu_di_kem) references dich_vu_di_kem(ma_dich_vu_di_kem)
);

insert into vi_tri (ten_vi_tri)
values('Quản Lý'),
	  ('Nhân Viên');
     
insert into trinh_do (ten_trinh_do)
values('Trung Cấp'),
     ('Cao Đẳng'),
     ('Đại Học'),
     ('Sau Đại Học');
     
insert into bo_phan (ten_bo_phan)
values('Sale-Marketing'),
	 ('Hành chính'),
     ('Phục vụ'),
     ('Quản lý');

insert into nhan_vien(ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan)
values('Nguyễn Văn An', '1970-11-07',	'456231786', 10000000, '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng',	1, 3, 1),
     ('Lê Văn Bình', '1997-04-09', '654231234', 7000000, '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', 1, 2, 2),
     ('Hồ Thị Yến', '1995-12-12', '999231723', 14000000, '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', 1, 3, 2),
     ('Võ Công Toản', '1980-04-04', '123231365', 17000000, '0374443232', 'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', 1, 4, 4),
     ('Nguyễn Bỉnh Phát', '1999-12-09', '454363232', 6000000, '0902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng', 2, 1, 1),
     ('Khúc Nguyễn An Nghi', '2000-11-08', '964542311', 7000000, '0978653213', 'annghi20@gmail.com', '294 Nguyễn Tất Thành, Đà Nẵng', 2, 2, 3),
     ('Nguyễn Hữu Hà', '1993-01-01', '534323231', 8000000, '0941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', 2, 3, 2),
     ('Nguyễn Hà Đông', '1989-09-03', '234414123', 9000000, '0642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', 2, 4, 4),
     ('Tòng Hoang', '1982-09-03', '256781231', 6000000, '0245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', 2, 4, 4),
     ('Nguyễn Công Đạo', '1994-01-08', '755434343', 8000000, '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', 2, 3, 2);
 
insert into loai_khach (ten_loai_khach)
values('Diamond'),
     ('Platinium'),
     ('Gold'),
     ('Silver'),
     ('Member');
     
insert into khach_hang(ma_khach_hang , ma_loai_khach , ho_ten , ngay_sinh , gioi_tinh , so_cmnd , so_dien_thoai , email , dia_chi)
values(1, 5, 'Nguyễn Thị Hào', '1970-11-07', 0, '643431213', '0987654321', 'thihao07@gmail.com', '23 Nguyễn Hoàng, Đà Nẵng'),
	 (2, 3, 'Phạm Xuân Diệu', '1992-08-08', 1, '865342123', '0987654321', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị'),
	 (3, 1, 'Trương Đình Nghệ', '1990-02-27', 1, '488645199', '0987654321', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh'),
	 (4, 1, 'Dương Văn Quan', '1981-07-08', 1, '634635974', '0987654321', 'duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng'),
	 (5, 4, 'Hoàng Trần Nhi Nhi', '1995-12-09', 0, '241234757', '0987654321', 'nhinhi123@gmail.com', '224 Lý Thái Tổ, Gia Lai'),
	 (6, 4, 'Tôn Nữ Mộc Châu', '2005-12-06', 0, '956352456', '0987654321', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng'),
	 (7, 1, 'Nguyễn Mỹ Kim', '1984-04-08', 0, '445682467', '0987654321', 'kimcuong84@gmail.com', 'K123/45 Lê Lợi, Hồ Chí Minh'),
	 (8, 3, 'Nguyễn Thị Hào', '1999-04-08', 0, '456789034', '0987654321', 'haohao99@gmail.com', '55 Nguyễn Văn Linh, Kon Tum'),
	 (9, 1, 'Trần Đại Danh', '1994-07-01', 1, '456788956', '0987654321', 'danhhai99@gmail.com', '24 Lý Thường Kiệt, Quảng Ngãi'),
	 (10, 2, 'Nguyễn Tâm Đắc', '1989-07-01', 1, '435678954', '0987654321', 'dactam@gmail.com', '22 Ngô Quyền, Đà Nẵng');
     
insert into kieu_thue (ten_kieu_thue)
values('year'),
     ('month'),
     ('day'),
     ('hour');
     
insert into loai_dich_vu (ma_loai_dich_vu, ten_loai_dich_vu)
values(1, 'Villa'),
     (2, 'House'),
     (3, 'Room');
    
insert into dich_vu
values(1, 'Villa Beach Front', 25000, 10000000, 10, 3, 1, 'vip', 'Có hồ bơi', 500, 4),
     (2, 'House Princess 01', 14000, 5000000, 7, 2, 2, 'vip', 'Có thêm bếp nướng', null, 3),
     (3, 'Room Twin 01', 5000, 1000000, 2, 4, 3, 'normal', 'Có tivi', null, null),
     (4, 'Villa No Beach Front', 22000, 9000000, 8, 3, 1, 'normal', 'Có hồ bơi', 300, 3),
     (5, 'House Princess 02', 10000, 4000000, 5, 3, 2, 'normal', 'Có thêm bếp nướng', null, 2),
     (6, 'Room Twin 02', 3000, 900000, 2, 4, 3, 'normal', 'Có tivi', null, null);

insert into dich_vu_di_kem
values(1, 'Karaoke', 10000, 'giờ', 'tiện nghi, hiện tại'),
     (2, 'Thuê xe máy', 10000, 'chiếc', 'hỏng 1 xe'),
     (3, 'Thuê xe đạp', 20000, 'chiếc', 'tốt'),
     (4, 'Buffet buổi sáng', 15000, 'suất', 'đầy đủ đồ ăn, tráng miệng'),
     (5, 'Buffet buổi trưa', 90000, 'suất', 'đầy đủ đồ ăn, tráng miệng'),
     (6, 'Buffet buổi tối', 16000, 'suất', 'đầy đủ đồ ăn, tráng miệng');
     
insert into hop_dong
values(1, '2020-12-08', '2020-12-08', 0, 3, 1, 3),
     (2, '2020-07-14', '2020-07-21', 200000, 7, 3, 1),
     (3, '2021-03-15', '2021-03-17', 50000, 3, 4, 2),
     (4, '2021-01-14', '2021-01-18', 100000, 7, 5, 5),
     (5, '2021-07-14', '2021-07-15', 0, 7, 2, 6),
     (6, '2021-06-01', '2021-06-03', 0, 7, 2, 6),
     (7, '2021-09-02', '2021-09-05', 100000, 7, 4, 4),
     (8, '2021-06-17', '2021-06-18', 150000, 3, 4, 1),
     (9, '2020-11-19', '2020-11-19', 0, 3, 4, 3),
     (10, '2021-04-12', '2021-04-14', 0, 10, 3, 5),
     (11, '2021-04-25', '2021-04-25', 0, 2, 2, 1),
     (12, '2021-05-25', '2021-05-27', 0, 7, 1, 1);
     
insert into hop_dong_chi_tiet
values(1,  2, 4, 5),
     (2, 2, 5, 8),
     (3, 2, 6, 15),
     (4, 3, 1, 1),
     (5, 3, 2, 11),
     (6, 1, 3, 1),
     (7, 1, 2, 2),
     (8, 12, 2, 2);


