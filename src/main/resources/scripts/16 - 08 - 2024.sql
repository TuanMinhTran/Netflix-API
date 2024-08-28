create database netflix;

use netflix;

create table users (
	id bigint primary key auto_increment,
    user_email varchar(50) unique not null,
    user_password varchar(100) not null,
    create_at timestamp default current_timestamp,
    update_at timestamp default current_timestamp
);

create table categories (
	id bigint primary key auto_increment,
    cate_name varchar(50)
);

create table movies (
	id bigint primary key auto_increment,
    url_movie varchar(100),
    title varchar(50),
    descriptions text,
    premiere_year char(4),
    runtime smallint,
    create_at timestamp default current_timestamp,
    update_at timestamp default current_timestamp,
    category_id bigint,
    foreign key (category_id) references categories(id)
);

create table packages (
	id bigint primary key auto_increment,
    pack_name varchar(20),
    pack_price double,
    quality varchar(50),
    resolation varchar(50)
);

insert into packages ( pack_name, pack_price, quality, resolation) values 
("Di dong",  "70000", "Video (Full HD)", "1080p (1920x1080)"),
("Co ban",  "70000", "Video (Full HD)", "1080p (1920x1080)"),
("Tieu chuan",  "70000", "Video (Full HD)", "1080p (1920x1080)"),
("Cao cap",  "70000", "Video (Full HD)", "1080p (1920x1080)");

create table devices ( 
	id bigint primary key auto_increment,
    device_1 varchar(20),
    device_2 varchar(20),
    device_3 varchar(20),
    device_4 varchar(20)
);

insert into devices ( device_1, device_2, device_3, device_4) values 
("Dien thoai", "may tinh bang", null, null),
("Dien thoai", "may tinh bang", "May tinh", null),
("Dien thoai", "may tinh bang", "May tinh", null),
("Dien thoai", "may tinh bang", "May tinh", "TV");

create table package_device (
	id bigint primary key auto_increment,
    package_id bigint,
    device_id bigint,
    foreign key (package_id) references packages(id),
    foreign key (device_id) references devices(id)
);

insert into package_device ( package_id, device_id) values 
(1, 1),
(2, 2),
(3, 3),
(4, 4);

ALTER TABLE movies
MODIFY title VARCHAR(50) CHARACTER SET utf8mb4;

ALTER TABLE movies ADD COLUMN url_thumbnail varchar(200);
ALTER TABLE movies modify COLUMN url_movie varchar(250);
ALTER TABLE movies modify COLUMN runtime varchar(25);

insert into categories( cate_name ) values ("Phim Viet Nam"), ("Phim My"), ("Phim Kinh Di");

insert into movies( url_movie, title, descriptions, premiere_year, runtime, category_id, url_thumbnail ) values
("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/winter-snowy-forest.mp4?alt=media&token=a854463b-d827-4fb7-9962-0efa01090700", 
"Rừng Thiên Nước Độc", "tam thoi chua co", 2024, "25 sec", 1, "https://i.vimeocdn.com/video/1914275021-7f0d57f215b9988962b969
9fb3b133ce6192d98c58048f64fdfa0ff126c27338-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/water-evening-sunset.mp4?alt=media&token=9dba6b73-9b4c-4f9b-a15e-ac3d87d915b7", 
"Sau Bình Minh", "tam thoi chua co", 2024, "54 sec", 1, "https://i.vimeocdn.com/video/1914274996-56ac2da25e233bd6bbe879980538
3f0973ad9313d02510ae7c634f336578981e-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/vacation-beach-coast.mp4?alt=media&token=2d6ad5b8-9275-429e-b41c-5eacc2f3061d", 
"Khu Nghỉ Dưỡng", "tam thoi chua co", 2024, "31 sec", 1, "https://i.vimeocdn.com/video/1914274927-9135f942fb5f539e276f55bae6f
0bd9bb36d4880ef28c4c145175300ac421644-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/snow-covered-rooftops.mp4?alt=media&token=e37738c3-25a3-4f9d-8cc8-70a4b1fb5c7c", 
"Thành Phố Tuyết", "tam thoi chua co", 2024, "21 sec", 1, "https://i.vimeocdn.com/video/1914274895-5ba8ac59752c7cacac646c09b5
724b17e9730df2330189b329b7df920e01f2cc-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/SampleVideo_1280x720_10mb.mp4?alt=media&token=5c314b87-8658-464c-a321-a4c73795ad49", 
"Dê Cụ 1", "tam thoi chua co", 2024, "1p2", 2, "https://i.vimeocdn.com/video/1914274814-ce55d4289d718110f37dde813354acfd6
19a479a524f8b50b5c1780807bf4dbb-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/SampleVideo_1280x720_20mb.mp4?alt=media&token=ad7a986c-7b35-420c-8531-e66caef76610", 
"Dê Cụ 2", "tam thoi chua co", 2024, "1p57", 2, "https://i.vimeocdn.com/video/1914274814-ce55d4289d718110f37dde813354acfd6
19a479a524f8b50b5c1780807bf4dbb-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/SampleVideo_1280x720_30mb.mp4?alt=media&token=72dd616a-bb5e-4378-8b72-3d8734a0b12f", 
"Dê Cụ 3", "tam thoi chua co", 2024, "2p50 ", 2, "https://i.vimeocdn.com/video/1914274814-ce55d4289d718110f37dde813354acfd6
19a479a524f8b50b5c1780807bf4dbb-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/fall-autumn-leaves.mp4?alt=media&token=0a03cba0-efd2-423b-9cad-ab452d01c8e6", 
"Mùa Tựu Trường", "tam thoi chua co", 2024, "54 sec", 2, "https://i.vimeocdn.com/video/1914274744-45b89bafc42496eca8b69d8cfb0
6d8e04b262a962ffebbfa2ed0a3041d4009e1-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/docked-boats-water.mp4?alt=media&token=acd27179-fb3f-4ced-9f84-dbaa5fd1cd02", 
"Biển", "tam thoi chua co", 2024, "48 sec", 3, "https://i.vimeocdn.com/video/1914274715-db6cee5f248b3267b3ba237aab342d3f7de72
362f400badc5cc7f97e089e966f-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/dirt-road-drive.mp4?alt=media&token=37bd6946-7725-43b5-a700-54bdd0e80828", 
"Sa Mạc Đông Đúc", "tam thoi chua co", 2024, "40 sec", 3, "https://i.vimeocdn.com/video/1914274667-5da3d4cd1f2317cfb444991cf9
3719dc4dc9625a61a543943e7ff9bfacea77ee-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/boat-ocean-wake.mp4?alt=media&token=8abfae7b-4c48-4919-a834-05c67b2ed951", 
"Du Thuyền và Biển", "tam thoi chua co", 2024, "36 sec", 3, "https://i.vimeocdn.com/video/1914274667-5da3d4cd1f2317cfb444991cf9
3719dc4dc9625a61a543943e7ff9bfacea77ee-d_640x360"),

("https://firebasestorage.googleapis.com/v0/b/netflix-d2442.appspot.com/o/coastal-aerial-ocean.mp4?alt=media&token=7bf4eaf8-210c-4e56-bc9b-f0db306f4c53", 
"Đất Rừng Phương Ấy", "tam thoi chua co", 2024, "38 sec", 3, "https://i.vimeocdn.com/video/1914274617-7a556a245edd50bff7d27cc816e89b173
4df3e57e5995b2ebdfb0b52d74bd1b4-d_640x360");

TRUNCATE TABLE movies;
/**
**/
select * from users;
select * from categories;
select * from movies;

SELECT
    p.id AS package_id,
    p.pack_name,
    p.pack_price,
    p.quality,
    p.resolation,
    d.id AS device_id,
    d.device_1,
    d.device_2,
    d.device_3,
    d.device_4
FROM
    packages p
JOIN
    package_device pd ON p.id = pd.package_id
JOIN
    devices d ON pd.device_id = d.id;









