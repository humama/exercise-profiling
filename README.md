# exercise-profiling

## Reflection
1. Performance Testing melakukan pengukuran terhadap sebuah sistem dengan cara mensimulasikan penggunaan sistem tersebut dalam suatu workload, sedangkan Profiling melakukan pengukuran terhadap operasi internal sebuah aplikasi, seperti lama waktu pemanggilan sebuah method. Dalam kata lain, performance testing mengukur performa sebuah sistem sebagai satu kesatuan, sedangkan profiling mengukur performa setiap komponen dalam sebuah sistem.

2. Profiling mengukur performa setiap method dalam sebuah aplikasi. Hasil pengukuran setiap method tersebut sangat membantu saya dalam mengetahui method apa saja yang memakan banyak waktu dalam pemanggilannya.

3. Ya, fitur-fiturnya seperti flame graph dan timeline cukup membantu saya dalam menemukan method dengan waktu eksekusi yang lama.

4. Saya sempat mengalami kesulitan memahami API JPARepository untuk melakukan query terhadap database. Saya mengatasi kesulitan tersebut dengan cara membaca dokumentasi Spring Data JPA dan melakukan query SQL manual menggunakan anotasi `@Query` pada method `StudentRepository.findAllName`.

5. IntelliJ Profiler terintegrasi dengan IntelliJ IDEA sehingga profiling dapat dilakukan dalam IDE tersebut saja, tanpa harus menggunakan program tambahan. Selain itu, antarmuka IntelliJ Profiler cukup ramah pengguna sehingga dapat meningkatkan produktivitas pengguna dalam melakukan profiling.

6. Biasanya, masalah ini timbul saat memanggil sebuah method untuk pertama kalinya. Java menggunakan Just-In-Time compiler sehingga memungkinkan sebuah method untuk di-compile saat method tersebut pertama kali dipanggil. Hal tersebut tentu menimbulkan sedikit inkonsistensi dalam pengukuran performa. Oleh karena itu, saya memastikan untuk mengakses endpoint yang digunakan untuk memanggil sebuah method setidaknya sekali sebelum melakukan performance testing dan profiling.

7. Saya memastikan ukuran total bytes yang dikirimkan sebagai response sebelum dan sesudah optimisasi sama. Selain itu, saya juga memastikan data response sebelum optimisasi sama dengan data response setelah optimisasi.

### /all-student Test Results
<details>
<summary>Before Optimization</summary>
![image](https://github.com/user-attachments/assets/a4df1a9a-2a86-4baa-9261-9151092545f7)
![image](https://github.com/user-attachments/assets/a99605df-5ff6-4326-b958-47b423fda016)
</details>
<details>
<summary>After Optimization</summary>
![image](https://github.com/user-attachments/assets/8b1fa678-8fc1-453f-9f28-43bd20a4363e)
![image](https://github.com/user-attachments/assets/dd2290c2-707c-454b-9aa3-e9d6b3af8080)
</details>

### /all-student-name Test Results

<details>
<summary>Before Optimization</summary>
![image](https://github.com/user-attachments/assets/46f33acc-50b5-4750-b77e-b21890f1fd17)
![image](https://github.com/user-attachments/assets/accb8549-02e1-4f2a-a3c6-94ef70242d10)
</details>
<details>
<summary>After Optimization</summary>
![image](https://github.com/user-attachments/assets/29838805-557d-4281-8a8e-b3f63c01e547)
![image](https://github.com/user-attachments/assets/820beb23-9878-4cff-ad06-63ac92532d6c)
</details>

### /highest-gpa Test Results
<details>
<summary>Before Optimization</summary>
![image](https://github.com/user-attachments/assets/f75534c8-5746-4674-9029-e38bb70dd5b1)
![image](https://github.com/user-attachments/assets/7161e4e1-9bbe-4833-8d85-d2746640bde5)
</details>
<details>
<summary>After Optimization</summary>
![image](https://github.com/user-attachments/assets/32586aea-45fd-4029-8598-3272668f0bc5)
![image](https://github.com/user-attachments/assets/230d793c-3d3d-4646-812c-ec5ab733e8fb)
</details>
