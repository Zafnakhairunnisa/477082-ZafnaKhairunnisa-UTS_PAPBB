package com.example.uts_papbb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class TechnologyActivity extends AppCompatActivity {

    public static final String EXTRA_USIA = "extra_usia";

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technology);

        int usia = getIntent().getIntExtra(EXTRA_USIA, 0);

        recyclerView = findViewById(R.id.rv_technology);

        String arrJudul13[]={"Survei: Minat Beli Kendaraan Listrik di Indonesia",

                "Indonesia Raih Banyak Penghargaan di SEA Game Awards 2022",

                "Robot Pintar Pembersih Lantai Ini Pakai Teknologi AI, Secanggih Apa?",

                "Mengenal Google Tensor G2, Otaknya Pixel 7",

                "Pesawat Luar Angkasa NASA Belokkan Asteroid untuk Selamatkan Bumi"
        };

        String arrKategori13[]={
                "Otomotif",
                "Game",
                "Gadget",
                "Gadget",
                "Sains"
        };

        String arrKonten13[]={

                "Jakarta, CNN Indonesia -- Survei terbaru dilakukan CNNIndonesia.com untuk membuktikan seberapa tinggi minat membeli masyarakat terhadap kendaraan listrik seiring dengan tersedianya berbagai merek mobil dan motor listrik saat ini di Indonesia.\n" +
                        "Dari hasil survei pada Rabu (12/10), sebanyak 1.127 responden yang terjaring. Mereka yang mengaku berminat membeli mobil listrik ada 608 responden, sedangkan 519 responden menyatakan tidak berminat.\n" +
                        "\n" +
                        "Sementara itu, ada 1.629 responden menyikapi kehadiran motor-motor listrik. Sebesar 974 voter tertarik membeli motor listrik, dan sisanya tidak tertarik dengan motor nol emisi itu.\n" +
                        "\n" +
                        "Di Indonesia sejumlah merek memasarkan mobil listrik mulai dari BMW, DFSK, Hyundai, Lexus, MINI, Nissan, Wuling dan yang akan datang Toyota.\n" +
                        "\n" +
                        "Untuk segmen roda dua, ada Alva, Gesits, Viar, Selis, United, Volta dan lainnya.\n" +
                        "\n" +
                        "Pertumbuhan mobil listrik dan hybrid\n" +
                        "Minat masyarakat terhadap mobil \"hijau\" di Indonesia mengalami peningkatan dalam empat tahun terakhir, meski tahun ini mobil elektrifikasi cuma mewakili 0,9 persen dari total penjualan mobil nasional.\n" +
                        "\n" +
                        "Gabungan Industri Kendaraan Bermotor Indonesia (Gaikindo) mencatat kendaraan elektrifikasi yang termasuk mobil listrik murni (BEV), hybrid, plug in hybrid (PHEV) terjual 4.849 unit pada Januari-Juli 2022.\n" +
                        "\n" +
                        "Penjualan BEV pada periode itu mencapai 626 unit, PHEV 10 unit, dan hybrid 4.213 unit. Total kontribusi kendaraan elektrifikasi sebesar 0,9 persen dari seluruh penjualan mobil sebanyak 561 ribu unit sampai Juli 2022.\n" +
                        "\n" +
                        "Kendati cuma ribuan dan terlihat kecil, sebenarnya penjualan kendaraan elektrifikasi sudah melebihi total penjualan segmen ini pada 2021.\n" +
                        "\n" +
                        "Selama 2021 mobil elektrifikasi terjual 3.205 unit atau 0,4 persen dari total pasar keseluruhan. Mobil hybrid merupakan kontributor penjualan mobil elektrifikasi pada tahun lalu yaitu 2.472 unit, sedangkan PHEV 46 unit, dan BEV 687 unit.\n" +
                        "\n" +
                        "Penjualan mobil elektrifikasi pada 2021 tumbuh dari catatan total penjualan pada 2020 yaitu 1.324 unit (0,2 persen) dan pada 2019 sebanyak 812 unit (0,1 persen).\n" +
                        "\n" +
                        "Penjualan mobil elektrifikasi di Indonesia terus mengalami pertumbuhan karena ditunjang faktor lain yaitu harganya yang semakin terjangkau.\n" +
                        "\n"
                ,

                        "Jakarta - Ajang penghargaan game bertajuk SEA Game Awards 2022 resmi berakhir. Indonesia sendiri berhasil menyabet empat penghargaan sekaligus.\n" +
                        "Acara ini telah memasuki tahun keenamnya sejak 2017, di mana kemeriahannya berbarengan dengan Level Up KL 2022. Event ini bertujuan untuk mengakui dan merayakan kreativitas, seni, serta kejeniusan dari para pengembang game terbaik dari Asia Tenggara dan internasional.\n" +
                        "\n" +
                        "Dari Indonesia, ada dua pengembang yang berhasil membanggakan Tanah Air, dengan meraih total empat penghargaan. Meskipun sebenarnya, ada beberapa developer yang gamenya juga masuk nominasi.\n" +
                        "\n" +
                        "Game Lokal Pemenang SEA Game Awards 2022\n" + "\n" +
                        "\t● Toge Productions - Coffee Talk Episode 2: Hibicus & Butterfly (Best Visual Arts Award)\n" +
                        "\t● Clay Game Studio - Faerie Afterlight (Rising Star Award)\n" +
                        "\t● Toge Productions - Coffee Talk Episode 2: Hibicus & Butterfly (Best Storytelling Award)\n" +
                        "\t● Toge Productions - Coffee Talk Episode 2: Hibicus & Butterfly (Grand Jury Award)\n" +
                        "\n" +
                        "Daftar Pemenang Lain di SEA Games Award 2022\n" + "\n" +
                        "\t● Khor Chin Heong - Determinant (Best Technology Award)\n" +
                        "\t● 7TH Beat Games - Rhythm Doctor (Best Innovation Award)\n" +
                        "\t● UOW Malaysia Kou - End of The Line (Best Student Game Award)\n" +
                        "\t● Battlebrew Productions - Cuisineer (Best Game Design Award)\n" +
                        "\t● 7TH Beat Games - Rhythm Doctor (Best Audio Award)\n" +
                        "\t● Kurechii - Post Knight 2 (Auience Choice Award)\n" +
                        "\t● CGCG - The Legend of Tianding (Best International Game Award)\n" +
                        "\t● Ifio Studio - Endura (Sponsored Award By Xsolla)\n" + "\n" +
                        "Ilham Hasymi Effendi, Co-Founder dan CEO Clay Games Studio, menyampaikan rasa senangnya karena bisa menyabet salah satu penghargaan di SEA Game Award 2022. Ia menyatakan, bahwa ini merupakan penghargaan internasional pertamanya.\n" +
                        "\n" +
                        "\"Ketika berangkat, kami sudah minder ketika tahu akan bersaing dengan berbagai studio yang hebat-hebat dari Asia Tenggara, termasuk studionya mentor kami, Toge Production. Kami sebenarnya masuk ke dalam nominasi di 4 kategori, namun hanya 1 saja yang bisa menang. Itu pun sudah sangat senang dan bersyukur sekali,\" ujarnya kepada detikINET.\n" +
                        "\n" +
                        "Senada dengan yang disampaikan oleh Ilham, Dio Mahesa, Art Director dan Lead Artist dari Coffee Talk Episode 2: Hibiscus & Butterfly, juga turut bahagia dengan pencapaian yang diperoleh. Apalagi, jumlahnya tidak sedikit, tetapi sampai tiga penghargaan dari satu game.\n" +
                        "\n" +
                        "\"Terima kasih banyak kepada teman-teman di Toge Productions yang sudah banyak support, sehingga penghargaan ini bisa kami raih,\" kata Dio.\n" +
                        "\n"
                        ,

                "Jakarta - Ecovacs Robotics (Ecovacs) memperkenalkan produk teranyarnya yakni DEEBOT T10 OMNI atau robot pembersih lantai berteknologi AI. DEEBOT T10 hadir dengan all-in-one OMNI Station yang mengkombinasikan fungsi dan design untuk memaksimalkan kenyamanan pengguna.\n" +
                        "OMNI Station adalah stasiun robot vacuum pertama yang mengintegrasikan pengumpulan debu, pencucian pel, pengisian air otomatis, dan pengeringan pel dengan udara panas.\n" +
                        "\n" +
                        "OMNI Station memiliki 2 tangki air berkapasitas 4 liter yang bertugas memisahkan air bersih dan air kotor. Teknologi tersebut akan secara mandiri mengumpulkan air pel kotor dan mengisi kembali tanki DEEBOT dengan air pel bersih.\n" +
                        "\n" +
                        "\"Hadirnya teknologi pengepelan OZMO Turbo 2.0 memperkaya fitur canggih yang dimiliki DEEBOT T10 OMNI seperti AIVI 3.0 AI-based Object Recognition dan Avoidance technology,\" kata Marketing Manager Mazuta Group Intan Indiana dalam keterangan tertulis, Kamis (13/10/2022).\n" +
                        "\n" +
                        "Inovasi ini memiliki kontrol suara YIKO membuat DEEBOT T10 OMNI layaknya robot asisten rumah tangga pintar. Pengguna dapat menggunakan perintah suara untuk berinteraksi dan memberikan perintah pada DEEBOT T10 OMNI. Tiga mikrofon pada DEEBOT T10 OMNI memudahkan pengguna untuk mengaktifkan robot vacuum hanya dengan berkata 'Ok, YIKO'.\n" +
                        "-ADVERTISEMENT-\n" +
                        "\n" +
                        "\"DEEBOT T10 OMNI dapat menjalankan seluruh proses bersih-bersih lantai secara mandiri. Tidak hanya menyapu, memvakum, dan mengepel lantai. Model terbaru ini mampu mencuci dan mengeringkan kain pel dan mengambil debu di dalam robot berkat stasiun terbaru. Kemampuan ini membuat DEEBOT T10 OMNI menjadi all-in-one robot vacuum yang siap membebaskan pengguna melakukan pekerjaan rumah,\" katanya.\n" +
                        "\n" +
                        "Ia menjelaskan produk teranyar tersebut telah dibalut dengan sejumlah fitur dan teknologi modern. Sehingga mampu memberikan pengalaman membersihkan rumah yang lebih efisien.\n" +
                        "\n" +
                        "AI Canggih dengan AIVI 3.0\n" +
                        "AI canggih ini berfungsi meningkatkan akurasi pengenalan single-frame object sebesar 20% dan kecepatan pengenalan object hingga 20 kali. Dengan kamera wide 960P bersudut pandang 148,3 derajat, DEEBOT T10 OMNI mengenali objek penghalang lebih cepat dan secara efisien menghindar.\n" +
                        "\n" +
                        "\"DEEBOT T10 OMNI juga hadir dengan sertifikat safety and privacy; TUV Rheinland, untuk software dan hardware,\" jelasnya.\n" +
                        "\n" +
                        "DEEBOT T10 OMNI juga mampu membersihkan berbagai jenis permukaan lantai dan karpet. Teknologi AIVI 3.0 dan sensor ultrasonic membantu robot vacuum mengenali berbagai tipe karpet. Ketika membersihkan karpet DEEBOT T10 OMNI secara otomatis mengganti tekanan dan akan menghindari karpet pada mode pel.\n" +
                        "\n" +
                        "\"Sensor anti-jatuh menjaga DEEBOT tidak terjatuh dari tangga dan ketinggian. Fitur real-time video juga memampukan pengguna melihat dan berkomunikasi dengan keluarga di rumah,\" jelasnya.\n" +
                        "\n" +
                        "TrueMapping 2.0 Cerdas dengan ECOVACS HOME App\n" +
                        "TrueMapping 2.0 pada DEEBOT T10 OMNI menggunakan dToF sensor untuk menambah akurasi. Fitur ini juga berguna untuk menyimpan peta 2D dan 3D pada aplikasi ECOVACS HOME di smartphone pengguna.\n" +
                        "\n" + "Memberikan Efektifitas Kebersihan 95%\n" +
                        "Daya hisap 5000 pa dengan cepat menghisap debu dan kotoran. Sikat utama yang mengambang menjaga robot vacuum dekat dengan lantai, tanpa menggores permukaan lantai. Keseluruhan design DEEBOT T10 OMNI memungkinkan robot vacuum beradaptasi dengan berbagai macam permukaan lantai rumah. OZMO TURBO 2.0 berputar 180 derajat menghilangkan kotoran membandel.\n" +
                        "\n" +
                        "Intan mengatakan produk yang dibandrol Rp 14.999.000 ini sudah bisa dipesan sejak 13 Oktober 2022 melalui Official Store ECOVACS di Tokopedia, Shopee, TikTok Shop, Blibli, dan Lazada.\n" +
                        "\n" +
                        "\"Cocok untuk lingkungan yang berdebu, bulu peliharaan, dan pengguna yang alergi dengan debu. Dengan banyak teknologi canggih, DEEBOT T10 OMNI memberikan efisiensi kebersihan 95%, menciptakan standar baru robot vacuum,\" tutupnya.\n" +
                        "\n",

                "Jakarta - Saat merilis lini Pixel 7, Google tak menjelaskan spesifikasi Tensor G2 secara mendalam. Baru sekarang mereka memberikan penjelasan lebih lanjut soal prosesor terbaru itu.\n" +
                        "Menurut juru bicara Google, Tensor G2 dibuat menggunakan proses 5nm, sama seperti Tensor G1 yang dipakai di Pixel 6, demikian dikutip detikINET dari GSM Arena, Kamis (13/10/2022).\n" +
                        "\n" +
                        "Namun sayangnya Google tak mengungkap apakah Tensor G2 ini dibuat menggunakan proses 5LPE Samsung seperti Tensor G1 atau menggunakan proses 5LPP yang lebih baru.\n" +
                        "\n" +
                        "Namun yang jelas Tensor G2 punya delapan core yang terbagi menjadi 2 core Core-X1, 2 core Cortex A78, dan empat core A55 dengan clock speed baru, dan GPU yang dipakai adalah Mali-G710 MP07.\n" +
                        "\n" +
                        "\n" +
                        "Proses 5nm ini sebenarnya bukan yang terbaru untuk saat ini, karena sudah ada yang memakai proses 4nm. Namun Google menjanjikan Tensor Processing Unit (TPU) baru yang dipakai punya peningkatan efisiensi daya, juga bisa menghandel kamera serta tugas machine learning 60% lebih kencang dibanding TPU yang ada di Tensor G1.\n" +
                        "\n" +
                        "Namun yang jelas Tensor G2 ini masih menganut 'nilai' yang sama seperti Tensor G1. Yaitu sama-sama tidak mengejar skor benchmark, karena skor benchmark keduanya memang tertinggal dari SoC lain dari generasi yang sama.\n" +
                        "\n" +
                        "Dari bocoran skor benchmark yang sudah beredar, Tensor G2 ini punya skor yang mirip dengan Snapdragon 888 keluaran dua tahun lalu. Bahkan skor single core di Geekbench-nya pun hanya unggul tipis dari Tensor G1.\n" +
                        "\n" +
                        "Di Geekbench single core, Tensor G2 mendapat skor 1068 dan multicore 3149. Sementara di AnTuTu v9 skornya adalah 801116.\n" +
                        "\n" +
                        "Sejak merilis Tensor G1 untuk Pixel 6, Google memang lebih mengedepankan chip yang bisa memberikan pengalaman pengguna terbaik untuk penggunanya, baik dari segi pengolahan gambar dari kamera, machine learning, serta keamanan.\n" +
                        "\n",

                "Jakarta, CNN Indonesia -- Badan Penerbangan dan Antariksa Amerika Serikat (NASA) mengatakan pesawat luar angkasa telah berhasil membelokkan asteroid dalam tes bersejarah kemampuan manusia. NASA menghentikan objek kosmik yang dinilai dapat menghancurkan kehidupan di bumi.\n" + "\n" +
                        "Misi Double Asteroid Redirection Test (DART) berukuran lemari es sengaja menabrak asteroid bulan Dimorphos pada 26 September. Dia mendorongnya ke orbit yang lebih kecil dan lebih cepat di sekitar kakaknya Didymos." + "\"DART memperpendek orbit 11 jam 55 menit menjadi 11 jam 23 menit,\" kata Kepala NASA Bill Nelson dikutip AFP.\n" +
                        "\n" +
                        "Menurutnya, DART mempercepat periode orbit Dimorphos sebesar 32 menit, melebihi perkiraan NASA sendiri selama 10 menit." + "\n" +
                        "\"Kami menunjukkan kepada dunia bahwa NASA serius sebagai pembela planet ini,\" tambah Nelson." + "\n" +
                        "Pasangan asteroid berputar bersama mengelilingi matahari setiap 2,1 tahun dan tidak menimbulkan ancaman bagi bumi.\n" +
                        "\n" +
                        "Tetapi mereka mempelajari metode \"dampak kinetik\" dari pertahanan planet, jika objek yang mendekat sebenarnya pernah terdeteksi.\n" +
                        "\n" +
                        "Keberhasilan DART sebagai pembuktian konsep, telah menjadi kenyataan dalam fiksi ilmiah -- terutama dalam film-film seperti \"Armageddon\" dan \"Don't Look Up.\""
                        + "\n"

        };

        String arrUsia13[]={
                "SU", "SU", "SU", "SU", "SU"
        };

        String arrTgl13[]={
                "Kamis, 13 Okt 2022 12:00 WIB", "Rabu, 12 Okt 2022 15:24 WIB", "Kamis, 13 Okt 2022 11:56 WIB", "Kamis, 13 Okt 2022 20:42 WIB", "Rabu, 12 Okt 2022 03:30 WIB"
        };

        int arrImage13[]={
                R.drawable.t1, R.drawable.t2, R.drawable.t3, R.drawable.t4, R.drawable.t5
        };

        String arrJudul[]={"Survei: Minat Beli Kendaraan Listrik di Indonesia",

                "Indonesia Raih Banyak Penghargaan di SEA Game Awards 2022",

                "Robot Pintar Pembersih Lantai Ini Pakai Teknologi AI, Secanggih Apa?",

                "Mengenal Google Tensor G2, Otaknya Pixel 7",

                "Pesawat Luar Angkasa NASA Belokkan Asteroid untuk Selamatkan Bumi",

                "Tabrakkan Pesawat DART ke Asteroid, NASA Habiskan Rp5 Triliun"
        };

        String arrKategori[]={
                "Otomotif",
                "Game",
                "Gadget",
                "Gadget",
                "Sains",
                "Sains"
        };

        String arrKonten[]={

                "Jakarta, CNN Indonesia -- Survei terbaru dilakukan CNNIndonesia.com untuk membuktikan seberapa tinggi minat membeli masyarakat terhadap kendaraan listrik seiring dengan tersedianya berbagai merek mobil dan motor listrik saat ini di Indonesia.\n" +
                        "Dari hasil survei pada Rabu (12/10), sebanyak 1.127 responden yang terjaring. Mereka yang mengaku berminat membeli mobil listrik ada 608 responden, sedangkan 519 responden menyatakan tidak berminat.\n" +
                        "\n" +
                        "Sementara itu, ada 1.629 responden menyikapi kehadiran motor-motor listrik. Sebesar 974 voter tertarik membeli motor listrik, dan sisanya tidak tertarik dengan motor nol emisi itu.\n" +
                        "\n" +
                        "Di Indonesia sejumlah merek memasarkan mobil listrik mulai dari BMW, DFSK, Hyundai, Lexus, MINI, Nissan, Wuling dan yang akan datang Toyota.\n" +
                        "\n" +
                        "Untuk segmen roda dua, ada Alva, Gesits, Viar, Selis, United, Volta dan lainnya.\n" +
                        "\n" +
                        "Pertumbuhan mobil listrik dan hybrid\n" +
                        "Minat masyarakat terhadap mobil \"hijau\" di Indonesia mengalami peningkatan dalam empat tahun terakhir, meski tahun ini mobil elektrifikasi cuma mewakili 0,9 persen dari total penjualan mobil nasional.\n" +
                        "\n" +
                        "Gabungan Industri Kendaraan Bermotor Indonesia (Gaikindo) mencatat kendaraan elektrifikasi yang termasuk mobil listrik murni (BEV), hybrid, plug in hybrid (PHEV) terjual 4.849 unit pada Januari-Juli 2022.\n" +
                        "\n" +
                        "Penjualan BEV pada periode itu mencapai 626 unit, PHEV 10 unit, dan hybrid 4.213 unit. Total kontribusi kendaraan elektrifikasi sebesar 0,9 persen dari seluruh penjualan mobil sebanyak 561 ribu unit sampai Juli 2022.\n" +
                        "\n" +
                        "Kendati cuma ribuan dan terlihat kecil, sebenarnya penjualan kendaraan elektrifikasi sudah melebihi total penjualan segmen ini pada 2021.\n" +
                        "\n" +
                        "Selama 2021 mobil elektrifikasi terjual 3.205 unit atau 0,4 persen dari total pasar keseluruhan. Mobil hybrid merupakan kontributor penjualan mobil elektrifikasi pada tahun lalu yaitu 2.472 unit, sedangkan PHEV 46 unit, dan BEV 687 unit.\n" +
                        "\n" +
                        "Penjualan mobil elektrifikasi pada 2021 tumbuh dari catatan total penjualan pada 2020 yaitu 1.324 unit (0,2 persen) dan pada 2019 sebanyak 812 unit (0,1 persen).\n" +
                        "\n" +
                        "Penjualan mobil elektrifikasi di Indonesia terus mengalami pertumbuhan karena ditunjang faktor lain yaitu harganya yang semakin terjangkau.\n" +
                        "\n"
                ,

                "Jakarta - Ajang penghargaan game bertajuk SEA Game Awards 2022 resmi berakhir. Indonesia sendiri berhasil menyabet empat penghargaan sekaligus.\n" +
                        "Acara ini telah memasuki tahun keenamnya sejak 2017, di mana kemeriahannya berbarengan dengan Level Up KL 2022. Event ini bertujuan untuk mengakui dan merayakan kreativitas, seni, serta kejeniusan dari para pengembang game terbaik dari Asia Tenggara dan internasional.\n" +
                        "\n" +
                        "Dari Indonesia, ada dua pengembang yang berhasil membanggakan Tanah Air, dengan meraih total empat penghargaan. Meskipun sebenarnya, ada beberapa developer yang gamenya juga masuk nominasi.\n" +
                        "\n" +
                        "Game Lokal Pemenang SEA Game Awards 2022\n" + "\n" +
                        "\t● Toge Productions - Coffee Talk Episode 2: Hibicus & Butterfly (Best Visual Arts Award)\n" +
                        "\t● Clay Game Studio - Faerie Afterlight (Rising Star Award)\n" +
                        "\t● Toge Productions - Coffee Talk Episode 2: Hibicus & Butterfly (Best Storytelling Award)\n" +
                        "\t● Toge Productions - Coffee Talk Episode 2: Hibicus & Butterfly (Grand Jury Award)\n" +
                        "\n" +
                        "Daftar Pemenang Lain di SEA Games Award 2022\n" + "\n" +
                        "\t● Khor Chin Heong - Determinant (Best Technology Award)\n" +
                        "\t● 7TH Beat Games - Rhythm Doctor (Best Innovation Award)\n" +
                        "\t● UOW Malaysia Kou - End of The Line (Best Student Game Award)\n" +
                        "\t● Battlebrew Productions - Cuisineer (Best Game Design Award)\n" +
                        "\t● 7TH Beat Games - Rhythm Doctor (Best Audio Award)\n" +
                        "\t● Kurechii - Post Knight 2 (Auience Choice Award)\n" +
                        "\t● CGCG - The Legend of Tianding (Best International Game Award)\n" +
                        "\t● Ifio Studio - Endura (Sponsored Award By Xsolla)\n" + "\n" +
                        "Ilham Hasymi Effendi, Co-Founder dan CEO Clay Games Studio, menyampaikan rasa senangnya karena bisa menyabet salah satu penghargaan di SEA Game Award 2022. Ia menyatakan, bahwa ini merupakan penghargaan internasional pertamanya.\n" +
                        "\n" +
                        "\"Ketika berangkat, kami sudah minder ketika tahu akan bersaing dengan berbagai studio yang hebat-hebat dari Asia Tenggara, termasuk studionya mentor kami, Toge Production. Kami sebenarnya masuk ke dalam nominasi di 4 kategori, namun hanya 1 saja yang bisa menang. Itu pun sudah sangat senang dan bersyukur sekali,\" ujarnya kepada detikINET.\n" +
                        "\n" +
                        "Senada dengan yang disampaikan oleh Ilham, Dio Mahesa, Art Director dan Lead Artist dari Coffee Talk Episode 2: Hibiscus & Butterfly, juga turut bahagia dengan pencapaian yang diperoleh. Apalagi, jumlahnya tidak sedikit, tetapi sampai tiga penghargaan dari satu game.\n" +
                        "\n" +
                        "\"Terima kasih banyak kepada teman-teman di Toge Productions yang sudah banyak support, sehingga penghargaan ini bisa kami raih,\" kata Dio.\n" +
                        "\n"
                ,

                "Jakarta - Ecovacs Robotics (Ecovacs) memperkenalkan produk teranyarnya yakni DEEBOT T10 OMNI atau robot pembersih lantai berteknologi AI. DEEBOT T10 hadir dengan all-in-one OMNI Station yang mengkombinasikan fungsi dan design untuk memaksimalkan kenyamanan pengguna.\n" +
                        "OMNI Station adalah stasiun robot vacuum pertama yang mengintegrasikan pengumpulan debu, pencucian pel, pengisian air otomatis, dan pengeringan pel dengan udara panas.\n" +
                        "\n" +
                        "OMNI Station memiliki 2 tangki air berkapasitas 4 liter yang bertugas memisahkan air bersih dan air kotor. Teknologi tersebut akan secara mandiri mengumpulkan air pel kotor dan mengisi kembali tanki DEEBOT dengan air pel bersih.\n" +
                        "\n" +
                        "\"Hadirnya teknologi pengepelan OZMO Turbo 2.0 memperkaya fitur canggih yang dimiliki DEEBOT T10 OMNI seperti AIVI 3.0 AI-based Object Recognition dan Avoidance technology,\" kata Marketing Manager Mazuta Group Intan Indiana dalam keterangan tertulis, Kamis (13/10/2022).\n" +
                        "\n" +
                        "Inovasi ini memiliki kontrol suara YIKO membuat DEEBOT T10 OMNI layaknya robot asisten rumah tangga pintar. Pengguna dapat menggunakan perintah suara untuk berinteraksi dan memberikan perintah pada DEEBOT T10 OMNI. Tiga mikrofon pada DEEBOT T10 OMNI memudahkan pengguna untuk mengaktifkan robot vacuum hanya dengan berkata 'Ok, YIKO'.\n" +
                        "-ADVERTISEMENT-\n" +
                        "\n" +
                        "\"DEEBOT T10 OMNI dapat menjalankan seluruh proses bersih-bersih lantai secara mandiri. Tidak hanya menyapu, memvakum, dan mengepel lantai. Model terbaru ini mampu mencuci dan mengeringkan kain pel dan mengambil debu di dalam robot berkat stasiun terbaru. Kemampuan ini membuat DEEBOT T10 OMNI menjadi all-in-one robot vacuum yang siap membebaskan pengguna melakukan pekerjaan rumah,\" katanya.\n" +
                        "\n" +
                        "Ia menjelaskan produk teranyar tersebut telah dibalut dengan sejumlah fitur dan teknologi modern. Sehingga mampu memberikan pengalaman membersihkan rumah yang lebih efisien.\n" +
                        "\n" +
                        "AI Canggih dengan AIVI 3.0\n" +
                        "AI canggih ini berfungsi meningkatkan akurasi pengenalan single-frame object sebesar 20% dan kecepatan pengenalan object hingga 20 kali. Dengan kamera wide 960P bersudut pandang 148,3 derajat, DEEBOT T10 OMNI mengenali objek penghalang lebih cepat dan secara efisien menghindar.\n" +
                        "\n" +
                        "\"DEEBOT T10 OMNI juga hadir dengan sertifikat safety and privacy; TUV Rheinland, untuk software dan hardware,\" jelasnya.\n" +
                        "\n" +
                        "DEEBOT T10 OMNI juga mampu membersihkan berbagai jenis permukaan lantai dan karpet. Teknologi AIVI 3.0 dan sensor ultrasonic membantu robot vacuum mengenali berbagai tipe karpet. Ketika membersihkan karpet DEEBOT T10 OMNI secara otomatis mengganti tekanan dan akan menghindari karpet pada mode pel.\n" +
                        "\n" +
                        "\"Sensor anti-jatuh menjaga DEEBOT tidak terjatuh dari tangga dan ketinggian. Fitur real-time video juga memampukan pengguna melihat dan berkomunikasi dengan keluarga di rumah,\" jelasnya.\n" +
                        "\n" +
                        "TrueMapping 2.0 Cerdas dengan ECOVACS HOME App\n" +
                        "TrueMapping 2.0 pada DEEBOT T10 OMNI menggunakan dToF sensor untuk menambah akurasi. Fitur ini juga berguna untuk menyimpan peta 2D dan 3D pada aplikasi ECOVACS HOME di smartphone pengguna.\n" +
                        "\n" + "Memberikan Efektifitas Kebersihan 95%\n" +
                        "Daya hisap 5000 pa dengan cepat menghisap debu dan kotoran. Sikat utama yang mengambang menjaga robot vacuum dekat dengan lantai, tanpa menggores permukaan lantai. Keseluruhan design DEEBOT T10 OMNI memungkinkan robot vacuum beradaptasi dengan berbagai macam permukaan lantai rumah. OZMO TURBO 2.0 berputar 180 derajat menghilangkan kotoran membandel.\n" +
                        "\n" +
                        "Intan mengatakan produk yang dibandrol Rp 14.999.000 ini sudah bisa dipesan sejak 13 Oktober 2022 melalui Official Store ECOVACS di Tokopedia, Shopee, TikTok Shop, Blibli, dan Lazada.\n" +
                        "\n" +
                        "\"Cocok untuk lingkungan yang berdebu, bulu peliharaan, dan pengguna yang alergi dengan debu. Dengan banyak teknologi canggih, DEEBOT T10 OMNI memberikan efisiensi kebersihan 95%, menciptakan standar baru robot vacuum,\" tutupnya.\n" +
                        "\n",

                "Jakarta - Saat merilis lini Pixel 7, Google tak menjelaskan spesifikasi Tensor G2 secara mendalam. Baru sekarang mereka memberikan penjelasan lebih lanjut soal prosesor terbaru itu.\n" +
                        "Menurut juru bicara Google, Tensor G2 dibuat menggunakan proses 5nm, sama seperti Tensor G1 yang dipakai di Pixel 6, demikian dikutip detikINET dari GSM Arena, Kamis (13/10/2022).\n" +
                        "\n" +
                        "Namun sayangnya Google tak mengungkap apakah Tensor G2 ini dibuat menggunakan proses 5LPE Samsung seperti Tensor G1 atau menggunakan proses 5LPP yang lebih baru.\n" +
                        "\n" +
                        "Namun yang jelas Tensor G2 punya delapan core yang terbagi menjadi 2 core Core-X1, 2 core Cortex A78, dan empat core A55 dengan clock speed baru, dan GPU yang dipakai adalah Mali-G710 MP07.\n" +
                        "\n" +
                        "\n" +
                        "Proses 5nm ini sebenarnya bukan yang terbaru untuk saat ini, karena sudah ada yang memakai proses 4nm. Namun Google menjanjikan Tensor Processing Unit (TPU) baru yang dipakai punya peningkatan efisiensi daya, juga bisa menghandel kamera serta tugas machine learning 60% lebih kencang dibanding TPU yang ada di Tensor G1.\n" +
                        "\n" +
                        "Namun yang jelas Tensor G2 ini masih menganut 'nilai' yang sama seperti Tensor G1. Yaitu sama-sama tidak mengejar skor benchmark, karena skor benchmark keduanya memang tertinggal dari SoC lain dari generasi yang sama.\n" +
                        "\n" +
                        "Dari bocoran skor benchmark yang sudah beredar, Tensor G2 ini punya skor yang mirip dengan Snapdragon 888 keluaran dua tahun lalu. Bahkan skor single core di Geekbench-nya pun hanya unggul tipis dari Tensor G1.\n" +
                        "\n" +
                        "Di Geekbench single core, Tensor G2 mendapat skor 1068 dan multicore 3149. Sementara di AnTuTu v9 skornya adalah 801116.\n" +
                        "\n" +
                        "Sejak merilis Tensor G1 untuk Pixel 6, Google memang lebih mengedepankan chip yang bisa memberikan pengalaman pengguna terbaik untuk penggunanya, baik dari segi pengolahan gambar dari kamera, machine learning, serta keamanan.\n" +
                        "\n",

                "Jakarta, CNN Indonesia -- Badan Penerbangan dan Antariksa Amerika Serikat (NASA) mengatakan pesawat luar angkasa telah berhasil membelokkan asteroid dalam tes bersejarah kemampuan manusia. NASA menghentikan objek kosmik yang dinilai dapat menghancurkan kehidupan di bumi.\n" + "\n" +
                        "Misi Double Asteroid Redirection Test (DART) berukuran lemari es sengaja menabrak asteroid bulan Dimorphos pada 26 September. Dia mendorongnya ke orbit yang lebih kecil dan lebih cepat di sekitar kakaknya Didymos." + "\"DART memperpendek orbit 11 jam 55 menit menjadi 11 jam 23 menit,\" kata Kepala NASA Bill Nelson dikutip AFP.\n" +
                        "\n" +
                        "Menurutnya, DART mempercepat periode orbit Dimorphos sebesar 32 menit, melebihi perkiraan NASA sendiri selama 10 menit." + "\n" +
                        "\"Kami menunjukkan kepada dunia bahwa NASA serius sebagai pembela planet ini,\" tambah Nelson." + "\n" +
                        "Pasangan asteroid berputar bersama mengelilingi matahari setiap 2,1 tahun dan tidak menimbulkan ancaman bagi bumi.\n" +
                        "\n" +
                        "Tetapi mereka mempelajari metode \"dampak kinetik\" dari pertahanan planet, jika objek yang mendekat sebenarnya pernah terdeteksi.\n" +
                        "\n" +
                        "Keberhasilan DART sebagai pembuktian konsep, telah menjadi kenyataan dalam fiksi ilmiah -- terutama dalam film-film seperti \"Armageddon\" dan \"Don't Look Up.\""
                        + "\n",

                "Jakarta, CNN Indonesia -- Badan Penerbangan dan Antariksa Amerika Serikat (NASA) menuntaskan misi menabrakkan pesawat nirawak ke asteroid Dimorphos, Selasa (26/9) pagi WIB. Berapa harga misi 'bunuh diri' itu?\n" +
                        "Melansir Forbes, misi yang disebut dengan Double Asteroid Redirection Test (DART) ini menelan biaya US$330 juta atau Rp5 triliun (1USD= 15.167). Misi ini dilakukan untuk melihat apakah pesawat luar angkasa mampu mengubah trajektori asteroid lewat hentakan kinetik untuk mengalihkannya dari menabrak Bumi.\n" +
                        "\n" +
                        "Parameter kesuksesan misi ini tidak bisa dilihat instan. Seperti dikutip dari Reuters, para ahli baru bisa melihatnya bulan depan lewat observasi teleskop daratan." + "\n" +
                        "Akan tetapi, NASA optimistis usaha ini membuahkan hasil. \"Pekerjaan NASA untuk keuntungan umat manusia. Jadi, melakukan hal seperti ini adalah tujuan utama pemenuhan misi kami,\" kata Deputi Administrator NASA, Pam Melroy.\n" +
                        "\n" +
                        "\"Sebuah pertunjukan teknologi, yang siapa tahu bisa menyelamatkan rumah kita,\" ujarnya menambahkan.\n" +
                        "\n" +
                        "DART diluncurkan lewat roket SpaceX pada November 2021. Pesawat ini kebanyakan dikendalikan oleh NASA dengan kontrolnya diserahkan kepada navigasi sistem otomatis pada saat-saat terakhir perjalanannya.\n" +
                        "\n" +
                        "DART terbang ke arah asteroid Dimorphos dengan kecepatan 24 ribu km/jam, menciptakan kecepatan yang cukup untuk mengubah lintasannya."+ "\n" +
                        "Menurut tim ahli DART, pesawat ini diharapkan memendekkan orbit Dimorphos sekitar 10 menit, namun 73 detik pun sudah dianggap sukses. Selanjutnya, para ahli akan melakukan pemantauan pasca tabrakan pada Oktober bulan depan.\n" +
                        "\n" +
                        "Perekaman tabrakan ini sendiri dilakukan oleh perangkat bernama LICIACube yang merupakan singkatan dari Light Italian Cubesat for Imaging Asteroids.\n" +
                        "LICIA Cube inilah yang akan mengambil beberapa foto hasil dari tabrakan itu dan mengirimnya ke Bumi.\n" +
                        "\n" +
                        "NASA sendiri diprediksi akan merilis foto itu pada 28 September, karena perangkat itu butuh waktu untuk mengirim foto ke Bumi."+ "\n" +
                        "Asteroid Dimorphos dan Didymos sejatinya tak berbahaya bagi Bumi. Dimorphos sendiri merupakan asteroid satelit dari Didymos yang berukuran lebih besar yakni 780 meter.\n" +
                        "\n" +
                        "Dimorphos berukuran sekitar 160 meter. Karena ukurannya inilah, asteroid tersebut dianggap bisa menjadi eksperimen yang pas untuk mengetes sistem pertahanan planet NASA." + "\n"

        };

        String arrUsia[]={
                "SU", "SU", "SU", "SU", "SU", "13+"
        };

        String arrTgl[]={
                "Kamis, 13 Okt 2022 12:00 WIB", "Rabu, 12 Okt 2022 15:24 WIB", "Kamis, 13 Okt 2022 11:56 WIB", "Kamis, 13 Okt 2022 20:42 WIB", "Rabu, 12 Okt 2022 03:30 WIB", "Selasa, 27 Sep 2022 15:55 WIB"
        };

        int arrImage[]={
                R.drawable.t1, R.drawable.t2, R.drawable.t3, R.drawable.t4, R.drawable.t5, R.drawable.t6
        };


        String arrJudul17[]={"Survei: Minat Beli Kendaraan Listrik di Indonesia",

                "Indonesia Raih Banyak Penghargaan di SEA Game Awards 2022",

                "Robot Pintar Pembersih Lantai Ini Pakai Teknologi AI, Secanggih Apa?",

                "Mengenal Google Tensor G2, Otaknya Pixel 7",

                "Pesawat Luar Angkasa NASA Belokkan Asteroid untuk Selamatkan Bumi",

                "Tabrakkan Pesawat DART ke Asteroid, NASA Habiskan Rp5 Triliun",

                "Among Us Versi VR Bakal Rilis Bulan Depan"
        };

        String arrKategori17[]={
                "Otomotif",
                "Games",
                "Gadget",
                "Gadget",
                "Sains",
                "Sains",
                "Games"
        };

        String arrKonten17[]={

                "Jakarta, CNN Indonesia -- Survei terbaru dilakukan CNNIndonesia.com untuk membuktikan seberapa tinggi minat membeli masyarakat terhadap kendaraan listrik seiring dengan tersedianya berbagai merek mobil dan motor listrik saat ini di Indonesia.\n" +
                        "Dari hasil survei pada Rabu (12/10), sebanyak 1.127 responden yang terjaring. Mereka yang mengaku berminat membeli mobil listrik ada 608 responden, sedangkan 519 responden menyatakan tidak berminat.\n" +
                        "\n" +
                        "Sementara itu, ada 1.629 responden menyikapi kehadiran motor-motor listrik. Sebesar 974 voter tertarik membeli motor listrik, dan sisanya tidak tertarik dengan motor nol emisi itu.\n" +
                        "\n" +
                        "Di Indonesia sejumlah merek memasarkan mobil listrik mulai dari BMW, DFSK, Hyundai, Lexus, MINI, Nissan, Wuling dan yang akan datang Toyota.\n" +
                        "\n" +
                        "Untuk segmen roda dua, ada Alva, Gesits, Viar, Selis, United, Volta dan lainnya.\n" +
                        "\n" +
                        "Pertumbuhan mobil listrik dan hybrid\n" +
                        "Minat masyarakat terhadap mobil \"hijau\" di Indonesia mengalami peningkatan dalam empat tahun terakhir, meski tahun ini mobil elektrifikasi cuma mewakili 0,9 persen dari total penjualan mobil nasional.\n" +
                        "\n" +
                        "Gabungan Industri Kendaraan Bermotor Indonesia (Gaikindo) mencatat kendaraan elektrifikasi yang termasuk mobil listrik murni (BEV), hybrid, plug in hybrid (PHEV) terjual 4.849 unit pada Januari-Juli 2022.\n" +
                        "\n" +
                        "Penjualan BEV pada periode itu mencapai 626 unit, PHEV 10 unit, dan hybrid 4.213 unit. Total kontribusi kendaraan elektrifikasi sebesar 0,9 persen dari seluruh penjualan mobil sebanyak 561 ribu unit sampai Juli 2022.\n" +
                        "\n" +
                        "Kendati cuma ribuan dan terlihat kecil, sebenarnya penjualan kendaraan elektrifikasi sudah melebihi total penjualan segmen ini pada 2021.\n" +
                        "\n" +
                        "Selama 2021 mobil elektrifikasi terjual 3.205 unit atau 0,4 persen dari total pasar keseluruhan. Mobil hybrid merupakan kontributor penjualan mobil elektrifikasi pada tahun lalu yaitu 2.472 unit, sedangkan PHEV 46 unit, dan BEV 687 unit.\n" +
                        "\n" +
                        "Penjualan mobil elektrifikasi pada 2021 tumbuh dari catatan total penjualan pada 2020 yaitu 1.324 unit (0,2 persen) dan pada 2019 sebanyak 812 unit (0,1 persen).\n" +
                        "\n" +
                        "Penjualan mobil elektrifikasi di Indonesia terus mengalami pertumbuhan karena ditunjang faktor lain yaitu harganya yang semakin terjangkau.\n" +
                        "\n"
                ,

                "Jakarta - Ajang penghargaan game bertajuk SEA Game Awards 2022 resmi berakhir. Indonesia sendiri berhasil menyabet empat penghargaan sekaligus.\n" +
                        "Acara ini telah memasuki tahun keenamnya sejak 2017, di mana kemeriahannya berbarengan dengan Level Up KL 2022. Event ini bertujuan untuk mengakui dan merayakan kreativitas, seni, serta kejeniusan dari para pengembang game terbaik dari Asia Tenggara dan internasional.\n" +
                        "\n" +
                        "Dari Indonesia, ada dua pengembang yang berhasil membanggakan Tanah Air, dengan meraih total empat penghargaan. Meskipun sebenarnya, ada beberapa developer yang gamenya juga masuk nominasi.\n" +
                        "\n" +
                        "Game Lokal Pemenang SEA Game Awards 2022\n" + "\n" +
                        "\t● Toge Productions - Coffee Talk Episode 2: Hibicus & Butterfly (Best Visual Arts Award)\n" +
                        "\t● Clay Game Studio - Faerie Afterlight (Rising Star Award)\n" +
                        "\t● Toge Productions - Coffee Talk Episode 2: Hibicus & Butterfly (Best Storytelling Award)\n" +
                        "\t● Toge Productions - Coffee Talk Episode 2: Hibicus & Butterfly (Grand Jury Award)\n" +
                        "\n" +
                        "Daftar Pemenang Lain di SEA Games Award 2022\n" + "\n" +
                        "\t● Khor Chin Heong - Determinant (Best Technology Award)\n" +
                        "\t● 7TH Beat Games - Rhythm Doctor (Best Innovation Award)\n" +
                        "\t● UOW Malaysia Kou - End of The Line (Best Student Game Award)\n" +
                        "\t● Battlebrew Productions - Cuisineer (Best Game Design Award)\n" +
                        "\t● 7TH Beat Games - Rhythm Doctor (Best Audio Award)\n" +
                        "\t● Kurechii - Post Knight 2 (Auience Choice Award)\n" +
                        "\t● CGCG - The Legend of Tianding (Best International Game Award)\n" +
                        "\t● Ifio Studio - Endura (Sponsored Award By Xsolla)\n" + "\n" +
                        "Ilham Hasymi Effendi, Co-Founder dan CEO Clay Games Studio, menyampaikan rasa senangnya karena bisa menyabet salah satu penghargaan di SEA Game Award 2022. Ia menyatakan, bahwa ini merupakan penghargaan internasional pertamanya.\n" +
                        "\n" +
                        "\"Ketika berangkat, kami sudah minder ketika tahu akan bersaing dengan berbagai studio yang hebat-hebat dari Asia Tenggara, termasuk studionya mentor kami, Toge Production. Kami sebenarnya masuk ke dalam nominasi di 4 kategori, namun hanya 1 saja yang bisa menang. Itu pun sudah sangat senang dan bersyukur sekali,\" ujarnya kepada detikINET.\n" +
                        "\n" +
                        "Senada dengan yang disampaikan oleh Ilham, Dio Mahesa, Art Director dan Lead Artist dari Coffee Talk Episode 2: Hibiscus & Butterfly, juga turut bahagia dengan pencapaian yang diperoleh. Apalagi, jumlahnya tidak sedikit, tetapi sampai tiga penghargaan dari satu game.\n" +
                        "\n" +
                        "\"Terima kasih banyak kepada teman-teman di Toge Productions yang sudah banyak support, sehingga penghargaan ini bisa kami raih,\" kata Dio.\n" +
                        "\n"
                ,

                "Jakarta - Ecovacs Robotics (Ecovacs) memperkenalkan produk teranyarnya yakni DEEBOT T10 OMNI atau robot pembersih lantai berteknologi AI. DEEBOT T10 hadir dengan all-in-one OMNI Station yang mengkombinasikan fungsi dan design untuk memaksimalkan kenyamanan pengguna.\n" +
                        "OMNI Station adalah stasiun robot vacuum pertama yang mengintegrasikan pengumpulan debu, pencucian pel, pengisian air otomatis, dan pengeringan pel dengan udara panas.\n" +
                        "\n" +
                        "OMNI Station memiliki 2 tangki air berkapasitas 4 liter yang bertugas memisahkan air bersih dan air kotor. Teknologi tersebut akan secara mandiri mengumpulkan air pel kotor dan mengisi kembali tanki DEEBOT dengan air pel bersih.\n" +
                        "\n" +
                        "\"Hadirnya teknologi pengepelan OZMO Turbo 2.0 memperkaya fitur canggih yang dimiliki DEEBOT T10 OMNI seperti AIVI 3.0 AI-based Object Recognition dan Avoidance technology,\" kata Marketing Manager Mazuta Group Intan Indiana dalam keterangan tertulis, Kamis (13/10/2022).\n" +
                        "\n" +
                        "Inovasi ini memiliki kontrol suara YIKO membuat DEEBOT T10 OMNI layaknya robot asisten rumah tangga pintar. Pengguna dapat menggunakan perintah suara untuk berinteraksi dan memberikan perintah pada DEEBOT T10 OMNI. Tiga mikrofon pada DEEBOT T10 OMNI memudahkan pengguna untuk mengaktifkan robot vacuum hanya dengan berkata 'Ok, YIKO'.\n" +
                        "-ADVERTISEMENT-\n" +
                        "\n" +
                        "\"DEEBOT T10 OMNI dapat menjalankan seluruh proses bersih-bersih lantai secara mandiri. Tidak hanya menyapu, memvakum, dan mengepel lantai. Model terbaru ini mampu mencuci dan mengeringkan kain pel dan mengambil debu di dalam robot berkat stasiun terbaru. Kemampuan ini membuat DEEBOT T10 OMNI menjadi all-in-one robot vacuum yang siap membebaskan pengguna melakukan pekerjaan rumah,\" katanya.\n" +
                        "\n" +
                        "Ia menjelaskan produk teranyar tersebut telah dibalut dengan sejumlah fitur dan teknologi modern. Sehingga mampu memberikan pengalaman membersihkan rumah yang lebih efisien.\n" +
                        "\n" +
                        "AI Canggih dengan AIVI 3.0\n" +
                        "AI canggih ini berfungsi meningkatkan akurasi pengenalan single-frame object sebesar 20% dan kecepatan pengenalan object hingga 20 kali. Dengan kamera wide 960P bersudut pandang 148,3 derajat, DEEBOT T10 OMNI mengenali objek penghalang lebih cepat dan secara efisien menghindar.\n" +
                        "\n" +
                        "\"DEEBOT T10 OMNI juga hadir dengan sertifikat safety and privacy; TUV Rheinland, untuk software dan hardware,\" jelasnya.\n" +
                        "\n" +
                        "DEEBOT T10 OMNI juga mampu membersihkan berbagai jenis permukaan lantai dan karpet. Teknologi AIVI 3.0 dan sensor ultrasonic membantu robot vacuum mengenali berbagai tipe karpet. Ketika membersihkan karpet DEEBOT T10 OMNI secara otomatis mengganti tekanan dan akan menghindari karpet pada mode pel.\n" +
                        "\n" +
                        "\"Sensor anti-jatuh menjaga DEEBOT tidak terjatuh dari tangga dan ketinggian. Fitur real-time video juga memampukan pengguna melihat dan berkomunikasi dengan keluarga di rumah,\" jelasnya.\n" +
                        "\n" +
                        "TrueMapping 2.0 Cerdas dengan ECOVACS HOME App\n" +
                        "TrueMapping 2.0 pada DEEBOT T10 OMNI menggunakan dToF sensor untuk menambah akurasi. Fitur ini juga berguna untuk menyimpan peta 2D dan 3D pada aplikasi ECOVACS HOME di smartphone pengguna.\n" +
                        "\n" + "Memberikan Efektifitas Kebersihan 95%\n" +
                        "Daya hisap 5000 pa dengan cepat menghisap debu dan kotoran. Sikat utama yang mengambang menjaga robot vacuum dekat dengan lantai, tanpa menggores permukaan lantai. Keseluruhan design DEEBOT T10 OMNI memungkinkan robot vacuum beradaptasi dengan berbagai macam permukaan lantai rumah. OZMO TURBO 2.0 berputar 180 derajat menghilangkan kotoran membandel.\n" +
                        "\n" +
                        "Intan mengatakan produk yang dibandrol Rp 14.999.000 ini sudah bisa dipesan sejak 13 Oktober 2022 melalui Official Store ECOVACS di Tokopedia, Shopee, TikTok Shop, Blibli, dan Lazada.\n" +
                        "\n" +
                        "\"Cocok untuk lingkungan yang berdebu, bulu peliharaan, dan pengguna yang alergi dengan debu. Dengan banyak teknologi canggih, DEEBOT T10 OMNI memberikan efisiensi kebersihan 95%, menciptakan standar baru robot vacuum,\" tutupnya.\n" +
                        "\n",

                "Jakarta - Saat merilis lini Pixel 7, Google tak menjelaskan spesifikasi Tensor G2 secara mendalam. Baru sekarang mereka memberikan penjelasan lebih lanjut soal prosesor terbaru itu.\n" +
                        "Menurut juru bicara Google, Tensor G2 dibuat menggunakan proses 5nm, sama seperti Tensor G1 yang dipakai di Pixel 6, demikian dikutip detikINET dari GSM Arena, Kamis (13/10/2022).\n" +
                        "\n" +
                        "Namun sayangnya Google tak mengungkap apakah Tensor G2 ini dibuat menggunakan proses 5LPE Samsung seperti Tensor G1 atau menggunakan proses 5LPP yang lebih baru.\n" +
                        "\n" +
                        "Namun yang jelas Tensor G2 punya delapan core yang terbagi menjadi 2 core Core-X1, 2 core Cortex A78, dan empat core A55 dengan clock speed baru, dan GPU yang dipakai adalah Mali-G710 MP07.\n" +
                        "\n" +
                        "\n" +
                        "Proses 5nm ini sebenarnya bukan yang terbaru untuk saat ini, karena sudah ada yang memakai proses 4nm. Namun Google menjanjikan Tensor Processing Unit (TPU) baru yang dipakai punya peningkatan efisiensi daya, juga bisa menghandel kamera serta tugas machine learning 60% lebih kencang dibanding TPU yang ada di Tensor G1.\n" +
                        "\n" +
                        "Namun yang jelas Tensor G2 ini masih menganut 'nilai' yang sama seperti Tensor G1. Yaitu sama-sama tidak mengejar skor benchmark, karena skor benchmark keduanya memang tertinggal dari SoC lain dari generasi yang sama.\n" +
                        "\n" +
                        "Dari bocoran skor benchmark yang sudah beredar, Tensor G2 ini punya skor yang mirip dengan Snapdragon 888 keluaran dua tahun lalu. Bahkan skor single core di Geekbench-nya pun hanya unggul tipis dari Tensor G1.\n" +
                        "\n" +
                        "Di Geekbench single core, Tensor G2 mendapat skor 1068 dan multicore 3149. Sementara di AnTuTu v9 skornya adalah 801116.\n" +
                        "\n" +
                        "Sejak merilis Tensor G1 untuk Pixel 6, Google memang lebih mengedepankan chip yang bisa memberikan pengalaman pengguna terbaik untuk penggunanya, baik dari segi pengolahan gambar dari kamera, machine learning, serta keamanan.\n" +
                        "\n",

                "Jakarta, CNN Indonesia -- Badan Penerbangan dan Antariksa Amerika Serikat (NASA) mengatakan pesawat luar angkasa telah berhasil membelokkan asteroid dalam tes bersejarah kemampuan manusia. NASA menghentikan objek kosmik yang dinilai dapat menghancurkan kehidupan di bumi.\n" + "\n" +
                        "Misi Double Asteroid Redirection Test (DART) berukuran lemari es sengaja menabrak asteroid bulan Dimorphos pada 26 September. Dia mendorongnya ke orbit yang lebih kecil dan lebih cepat di sekitar kakaknya Didymos." + "\"DART memperpendek orbit 11 jam 55 menit menjadi 11 jam 23 menit,\" kata Kepala NASA Bill Nelson dikutip AFP.\n" +
                        "\n" +
                        "Menurutnya, DART mempercepat periode orbit Dimorphos sebesar 32 menit, melebihi perkiraan NASA sendiri selama 10 menit." + "\n" +
                        "\"Kami menunjukkan kepada dunia bahwa NASA serius sebagai pembela planet ini,\" tambah Nelson." + "\n" +
                        "Pasangan asteroid berputar bersama mengelilingi matahari setiap 2,1 tahun dan tidak menimbulkan ancaman bagi bumi.\n" +
                        "\n" +
                        "Tetapi mereka mempelajari metode \"dampak kinetik\" dari pertahanan planet, jika objek yang mendekat sebenarnya pernah terdeteksi.\n" +
                        "\n" +
                        "Keberhasilan DART sebagai pembuktian konsep, telah menjadi kenyataan dalam fiksi ilmiah -- terutama dalam film-film seperti \"Armageddon\" dan \"Don't Look Up.\""
                        + "\n",

                "Jakarta, CNN Indonesia -- Badan Penerbangan dan Antariksa Amerika Serikat (NASA) menuntaskan misi menabrakkan pesawat nirawak ke asteroid Dimorphos, Selasa (26/9) pagi WIB. Berapa harga misi 'bunuh diri' itu?\n" +
                        "Melansir Forbes, misi yang disebut dengan Double Asteroid Redirection Test (DART) ini menelan biaya US$330 juta atau Rp5 triliun (1USD= 15.167). Misi ini dilakukan untuk melihat apakah pesawat luar angkasa mampu mengubah trajektori asteroid lewat hentakan kinetik untuk mengalihkannya dari menabrak Bumi.\n" +
                        "\n" +
                        "Parameter kesuksesan misi ini tidak bisa dilihat instan. Seperti dikutip dari Reuters, para ahli baru bisa melihatnya bulan depan lewat observasi teleskop daratan." + "\n" +
                        "Akan tetapi, NASA optimistis usaha ini membuahkan hasil. \"Pekerjaan NASA untuk keuntungan umat manusia. Jadi, melakukan hal seperti ini adalah tujuan utama pemenuhan misi kami,\" kata Deputi Administrator NASA, Pam Melroy.\n" +
                        "\n" +
                        "\"Sebuah pertunjukan teknologi, yang siapa tahu bisa menyelamatkan rumah kita,\" ujarnya menambahkan.\n" +
                        "\n" +
                        "DART diluncurkan lewat roket SpaceX pada November 2021. Pesawat ini kebanyakan dikendalikan oleh NASA dengan kontrolnya diserahkan kepada navigasi sistem otomatis pada saat-saat terakhir perjalanannya.\n" +
                        "\n" +
                        "DART terbang ke arah asteroid Dimorphos dengan kecepatan 24 ribu km/jam, menciptakan kecepatan yang cukup untuk mengubah lintasannya."+ "\n" +
                        "Menurut tim ahli DART, pesawat ini diharapkan memendekkan orbit Dimorphos sekitar 10 menit, namun 73 detik pun sudah dianggap sukses. Selanjutnya, para ahli akan melakukan pemantauan pasca tabrakan pada Oktober bulan depan.\n" +
                        "\n" +
                        "Perekaman tabrakan ini sendiri dilakukan oleh perangkat bernama LICIACube yang merupakan singkatan dari Light Italian Cubesat for Imaging Asteroids.\n" +
                        "LICIA Cube inilah yang akan mengambil beberapa foto hasil dari tabrakan itu dan mengirimnya ke Bumi.\n" +
                        "\n" +
                        "NASA sendiri diprediksi akan merilis foto itu pada 28 September, karena perangkat itu butuh waktu untuk mengirim foto ke Bumi."+ "\n" +
                        "Asteroid Dimorphos dan Didymos sejatinya tak berbahaya bagi Bumi. Dimorphos sendiri merupakan asteroid satelit dari Didymos yang berukuran lebih besar yakni 780 meter.\n" +
                        "\n" +
                        "Dimorphos berukuran sekitar 160 meter. Karena ukurannya inilah, asteroid tersebut dianggap bisa menjadi eksperimen yang pas untuk mengetes sistem pertahanan planet NASA." + "\n",

                "JAKARTA - Among Us versi virtual reality (VR) bakal meluncur bulan depan, tepatnya 10 November 2022 mendatang. Innersloth, Schell Games, dan Robot Teddy selaku pengembang telah mengkonfirmasinya.\n" +
                        "\n" +
                        "Dalam pengumuman resminya, dikatakan bahwa Among Us VR bisa dimainkan di Meta Quest 2 dan Steam. Meski tidak diungkap, namun kemungkinan besar juga akan tersedia di PlayStation VR." + "\n" +
                        "Seperti dalam versi 2D, Among Us VR meminta pemain untuk mengidentifikasi penipu sebelum mereka membunuh seluruh pemain. Namun kali ini, perspektif yang ditampilkan diubah menjadi perspektif orang pertama.\n" +
                        "\n" +
                        "Impostor sekarang akan lebih mudah menyelinap, dan pemain sekarang dapat menggunakan ekspresi tangan ketika menuduh orang lain atau memprotes ketidakbersalahan kepada pemain lain.\n" +
                        "\n" +
                        "Untuk diketahui, game Among Us berkembang pesat di hari-hari awal pandemi, ketika itu game menjadi salah satu cara terbaik untuk mendapat hiburan dan terhubung." + "\n" +
                        "Among Us versi VR sendiri, bukan satu-satunya game yang dikembangkan oleh Schell Games dan Meta. Dua perusahaan juga telah mengerjakan game versi VR lain.\n" +
                        "\n" +
                        "Keduanya telah mengembangkan tiga proyek yang belum diumumkan. Meta juga telah memamerkan trailer gameplay awal untuk game NFL VR berlisensi resmi pertama, NFL Pro Era."
        };

        String arrUsia17[]={
                "SU", "SU", "SU", "SU", "SU", "13+", "17+"
        };

        String arrTgl17[]={
                "Kamis, 13 Okt 2022 12:00 WIB", "Rabu, 12 Okt 2022 15:24 WIB", "Kamis, 13 Okt 2022 11:56 WIB", "Kamis, 13 Okt 2022 20:42 WIB", "Rabu, 12 Okt 2022 03:30 WIB", "Selasa, 27 Sep 2022 15:55", "Kamis 13 Oktober 2022 10:18 WIB"
        };

        int arrImage17[]={
                R.drawable.t1, R.drawable.t2, R.drawable.t3, R.drawable.t4, R.drawable.t5, R.drawable.t6, R.drawable.t7
        };


        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        if (usia < 13){
            recyclerView.setAdapter(new TechnologyAdapter(this, arrJudul13, arrKategori13, arrKonten13, arrTgl13, arrUsia13, arrImage13));
        }
        else if (usia < 17 && usia >= 13 ) {
            recyclerView.setAdapter(new TechnologyAdapter(this, arrJudul, arrKategori, arrKonten, arrTgl, arrUsia, arrImage));
        }
        else {
            recyclerView.setAdapter(new TechnologyAdapter(this, arrJudul17, arrKategori17, arrKonten17, arrTgl17, arrUsia17, arrImage17));
        }
    }
}