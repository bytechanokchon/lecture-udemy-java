# Skeleton of program

    import java.lang.*;

    public class Program {
        publc static void main(String[] args) {
            System.out.println("Hello World");
        }
    }

จากชุดคำสั่งด้านบน เป็นโปรแกรมที่เอาไว้แสดงข้อคตวาม Hello World

1. import java.lang.*; เป็นการดึง package ชื่อ lang มาใช้ในโปรแกรมของเรา

2. ทุก ๆ ชุดคำสั่งของจาวา จะถูกจัดเก็บอยู่ในรูปแบบของคลาส โดยชื่อคลาสกับชื่อของไฟล์จะต้องเหมือนกัน ถ้าหากไม่เหมือนกัน จะเกิดข้อผิดพลาด

3. ทุก ๆ โปรแกรมจาวา จะถูกเริ่มต้นทำงานที่ method main เสมอ

4. public ของ method main ทำให้ jvm สามารถเรียกใช้งาน main() ได้

5. static ของ method main ทำให้ jvm สามารถเรียกใช้งาน main() ได้ทันที เช่น Program.main()

6. String[] args ทำให้เราสามารถส่งข้อมูลบางอย่างเข้าไปได้ ในขึ้นตอนกำลังสั่งให้โปรแกรมทำงาน