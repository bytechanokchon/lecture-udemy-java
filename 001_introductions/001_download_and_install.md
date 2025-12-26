# Download and Installs
สำหรับการพัฒนาโปรแกรมภาษา Java เราจะต้องติดตั้ง JDK (Jave Development Kit) ซึ่งด้านในจะประกอบไปด้วย 

1. Compiler
2. Runtime Environment

ซึ่งเป็นตัวช่วยให้เราสามารถเขียนโปรแกรมด้วยภาษา Java และสามารถเรียกใช้งานโปรแกรมได้ และทำให้โปรแกรมเมอร์สามารถดีบักโปรแกรมได้

## ส่วนประกอบต่าง ๆ ของอุปกรณ์ที่ใช้ทำงานร่วมกับ Java
### Java Development Kit (JDK)
จัดเก็บอุปกรณ์ต่าง ๆ ที่ใช้ในการเขียนและดีบักโปรแกรมภาษา Java

### Java Runtime Environment (JRE)
เป็นอุปกรณ์ที่จัดเก็บ class libraries ต่าง ๆ ของ Java และทำหน้าที่แปรงชุดคำสั่ง Java ไปเป็น byte code *ซึ่งเป็นส่วนหนึ่งของ JDK*

### Java Virtual Machine (JVM)
ทำหน้าที่นำ byte code มาทำงาน *ซึ่งเป็นส่วนหนึ่งของ JRE*

![JRE Architecture](../images/001/jre-architecture.png)

## วิธีการติดตั้ง Java Development Kit

1. ดาวน์โหลด JDK จา่ก [Open Logic](https://www.openlogic.com/openjdk-downloads)
2. เซ็ท windows environment path ไปที่ bin ของ java เช่น C:\Program Files\Java\jdk-17\bin โดยตั้งชื่อว่า JAVA_HOME
3. ตรวจสอบว่าสามารถใช้งานได้ โดยการเปิด terminal แล้วรันคำสั่ง java --version หรือ javac --version