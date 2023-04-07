# morris_pratt_algoritmasi
 Morris pratt algoritması
**Morris-Pratt Algoritmasının amacı nedir?**

Morris-Pratt algoritması da bir metin dizisi ve bir arama dizisi verildiğinde, arama dizisini metin dizisinde aramak için kullanılan bir algoritmadır. Bu algoritma, arama işlemini gerçekleştirmeden önce arama dizisini işleyerek bir tablo oluşturur. Bu tablo, arama işleminde kullanılır ve arama süresini azaltır.

**Morris-Pratt Algoritmasının kullanımı nasıldır?**

Öncelikle, algoritma arama dizisini işleyerek bir tablo oluşturur. Bu tablo, arama işleminde kullanılan bir atlayış tablosudur. Ardından, metnin başından başlayarak arama işlemi gerçekleştirilir ve her bir eşleşme sonrasında tablodaki bilgiler kullanılarak arama işlemine devam edilir.

**Morris-Pratt algoritmasının çalışma zamanı analizi:**

Morris-Pratt algoritmasının çalışma zamanı analizi metin dizisinin uzunluğu olarak ifade edilen n değeri ve arama dizisinin uzunluğu olarak ifade edilen m değeri üzerinden yapılır.

**En iyi durumda**, aranan öğe metnin başındadır ve algoritma m adımda tamamlanır. Bu durumda, algoritmanın çalışma zamanı O(m) olarak ifade edilir.

**En kötü durumda**, arama dizisi metin dizisinin sonunda yer alır ve algoritma tüm metni tarar. Bu durumda, algoritmanın çalışma zamanı O(n+m) olarak ifade edilir.

**Ortalama durumda**, arama dizisi metin dizisi içinde rastgele bir konumda yer alır ve algoritma ortalama olarak n+m adımda arama işlemini tamamlar. Bu durumda, algoritmanın çalışma zamanı O(n+m) olarak ifade edilir.

Morris-Pratt algoritması, arama işlemi sırasında önceden hesaplanan bir dizi kullanarak arama işlemini hızlandırır. Bu dizi, önek fonksiyonu (prefix function) olarak bilinir ve arama işlemi sırasında, eşleşmeyen karakterlerin nereden başlayacağını belirlemeye yardımcı olur.

Morris-Pratt algoritması, özellikle arama dizisinin uzunluğu m'nin büyük olduğu durumlarda diğer string matching algoritmalarına kıyasla daha hızlıdır. Algoritmanın çalışma zamanı, önceden hesaplanan önek fonksiyonu sayesinde m ile doğru orantılıdır ve arama işlemi sırasında gereksiz karşılaştırmaların önüne geçer.
