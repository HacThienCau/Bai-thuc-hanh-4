# Bai-thuc-hanh-4
## Đề bài
Sử dụng Spring Boot xây dựng một backend đơn giản gồm các tính năng:
- Truy vấn từ cơ sở dữ liệu danh sách các sản phẩm giày hiện có.
- Trả về API danh sách sản phẩm giày.

## Cấu trúc thư mục
```
Bai-thuc-hanh-4
├── shoe-backend
│ ├── src\main
    ├── java\com\example
        ├── controller
        │ └── ShoeController.java
        ├── model
        │ └── Shoe.java
        ├── repository
        │ └── ShoeRepository.java
        └── Main.java
    └── resources
        ├── images
        │ ├── img1.png
        │ ├── img2.png
        │ ├── img3.png
        │ ├── img4.png
        │ ├── img5.png
        │ └── img6.png
        └── application.properties    
│ └── pom.xml
└── README.md
```
## Cài đặt và chạy
Chạy backend
```bash
cd shoe-backend
mvn spring-boot:run
```
API danh sách sản phẩm
```
http://localhost:8080/api/shoes
```
#### 22521641 - Nguyễn Đăng Hương Uyên - IE303.P22.1