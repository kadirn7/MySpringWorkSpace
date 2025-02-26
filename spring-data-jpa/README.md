## Teknolojiler

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok
- React (Frontend için CORS desteği)

## Proje Yapısı

### Entity Sınıfları
- `Student`: Öğrenci bilgilerini tutan entity
- `Customer`: Müşteri bilgilerini tutan entity
- `Address`: Adres bilgilerini tutan entity

### DTO (Data Transfer Objects)
- `DtoStudent`: Öğrenci verilerinin transfer nesnesi
- `DtoCustomer`: Müşteri verilerinin transfer nesnesi
- `DtoAddress`: Adres verilerinin transfer nesnesi

### Repository Katmanı
- `IStudentRepository`
- `ICustomerRepository`
- `IAddressRepository`

### Servis Katmanı
- `IStudentService` ve `StudentServiceImpl`
- `ICustomerService` ve `CustomerServiceImpl`
- `IAddressService` ve `AddressServiceImpl`

### Controller Katmanı
- `StudentControllerImpl`
- `CustomerControllerImpl`
- `AddressControllerImpl`


## Özellikler

1. **Öğrenci Yönetimi**
   - Öğrenci ekleme
   - Öğrenci listeleme
   - Öğrenci güncelleme
   - Öğrenci silme
   - ID ile öğrenci getirme

2. **Müşteri-Adres İlişkisi**
   - One-to-One ilişki
   - JSON sonsuz döngüsünü önlemek için `@JsonManagedReference` ve `@JsonBackReference` kullanımı

3. **Validation**
   - Bean validation ile veri doğrulama
   - Global exception handling

4. **CORS Yapılandırması**
   - React uygulaması için CORS desteği
   - Güvenli cross-origin istekleri

## Veritabanı Yapılandırması

properties

```
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.jpa.properties.hibernate.default_schema=student
spring.jpa.hibernate.ddl-auto=update
```

## API Endpoints

### Öğrenci API
- GET `/rest/api/student/list` - Tüm öğrencileri listele
- POST `/rest/api/student/save` - Yeni öğrenci ekle
- GET `/rest/api/student/list/{id}` - ID ile öğrenci getir

### Müşteri API
- GET `/rest/api/customer/list` - Tüm müşterileri listele
- POST `/rest/api/customer/save` - Yeni müşteri ekle
- GET `/rest/api/customer/list/{id}` - ID ile müşteri getir

### Adres API
- GET `/rest/api/address/list` - Tüm adresleri listele
- POST `/rest/api/address/save` - Yeni adres ekle
- GET `/rest/api/address/list/{id}` - ID ile adres getir

## Kurulum

1. PostgreSQL veritabanını kurun
2. application.properties dosyasındaki veritabanı bağlantı bilgilerini güncelleyin
3. Projeyi derleyin: `mvn clean install`
4. Uygulamayı çalıştırın: `mvn spring-boot:run`

## Frontend Entegrasyonu

React uygulaması için CORS yapılandırması eklenmiştir. Frontend uygulaması http://localhost:5173 portunda çalışacak şekilde ayarlanmıştır.

