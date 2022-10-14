package com.example.uts_papbb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

public class PoliticsActivity extends AppCompatActivity {

    public static final String EXTRA_USIA = "extra_usia";

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_politics);

        int usia = getIntent().getIntExtra(EXTRA_USIA, 0);

//        Toast toast = Toast.makeText(getApplicationContext(), Integer.toString(usia), Toast.LENGTH_SHORT);
//        toast.show();

        recyclerView = findViewById(R.id.rv_politics);

        String arrJudul13[]={
                "Pilpres 2024, PAN Tegaskan Realistis dan Ingin Menang",

                "Isu Reshuffle Kabinet Dinilai Bentuk Tekanan Politik dari Oligarki",

                "Kabar Reshuffle Kabinet, PPP Teringat PAN yang Mundur karena Berseberangan",

                "Berhasil Tutup Alexis, HNW Puji Anies Pemimpin Baik Datangkan Kemaslahatan Umat",

                "NasDem Instruksikan Pengurus Daerah Pasang Spanduk Anies Capres"

        };

        String arrKategori13[]={
                "Pemilu", "Pemerintah", "Pemerintah", "Pemilu", "Pemilu"

        };

        String arrKonten13[]={
                "JAKARTA - Sekretaris Jenderal (Sekjen) DPP PAN Eddy Soeparno menyampaikan, hasil Rakernas PAN sudah mengumumkan sembilan nama bakal Capres 2024. Sembilan nama ini akan dikerucutkan menjadi tiga atau lima nama.\n" +
                        "\n" +
                        "\"Akan kita kerucutkan nanti nama-nama tersebut menjadi 3 atau 5 nama dalam Rapimnas, yang akan kita laksanakan dalam waktu dekat,\" kata Eddy saat menerima kunjungan PSI di Kantor DPP PAN di Jakarta, Kamis (13/10/2022) malam.\n" +
                        "\n" +
                        "Kemudian Eddy menjelaskan, PAN akan membicarakan soal capres dan cawapres dengan teman-teman di Koalisi Indonesia Bersatu (KIB) yakni Partai Golkar dan PPP, untuk kemudian diputuskan bersama.\n" +
                        "\n" +
                        "\"Berdasarkan kesepahaman yang kita miliki bersama teman-teman KIB, kita akan bicarakan dengan Golkar dengan PPP. Ayok ini gimana nih, nama-nama ini gitu,\" terang Eddy." + "\n" +
                        "Olen karena itu Eddy menjelaskan, sejauh ini KIB masih saling tukar pikiran, dan sepakat untuk memberikan kesempatan bagi putra putri terbaik Indonesia untuk berkontestasi. Semakin banyak calon akan lebih bagus, karena masyarakat bisa punya pilihan.\n" +
                        "\n" +
                        "\"Kita ingin partisipasi masyarakat di dalam pemilu dan pilpres ke depan sangat tinggi, sehingga mereka juga bisa mampu mengetahui, mampu mengkritisi betul-betul membedah siapa calon-calon yang akan diajukan nantinya,\" jelasnya.\n" +
                        "\n" +
                        "\"Kita juga punya mekanisme internal dan umumkan nanti siapa, dan kita punya mekanisme di dalam KIB untuk nanti diumumkan, siapa saja yang diajukan,\" imbuh Wakil Ketua Komisi VII DPR ini."
                        + "\n" + "Soal Ketum PAN Zulkifli Hasan dan Ketum Golkar Airlangga Hartarto yang didorong menjadi capres, Eddy menerangkan, bagi sebuah partai, merupakan kebanggaan jika kader terbaik maju dalam Pilpres, tak terkecuali Golkar, PPP, maupun PAN.\n" +
                        "\n" +
                        "Jadi menurutnya, kalau PAN ditanya hari ini siapa yang akan dimajukan, tentu PAN akan mendorong putra terbaik PAN Zulkifli Hasan. Tetapi, PAN realistis karena ingin menang di Pilpres 2024.\n" +
                        "\n" +
                        "\"Tetapi kita mau realistis. Pilpres mau apa? Ya mau menang, bagaimana formulasi menangnya, ya inilah yang akan kita bahas sama-sama,\" tandasnya.\n",

                "JAKARTA - Wacana pergantian menteri atau reshuffle kabinet dinilai sebagai salah satu bentuk tekanan politik oligarki terhadap sistem demokrasi. Hal ini ditegaskan oleh Kepala Badan Komunikasi Strategis DPP/Koordinator Juru Bicara DPP Partai Demokrat, Herzaky Mahendra Putra.\n" +
                        "\n" +
                        "\"Tekanan, intimidasi, paksaan dalam bentuk apapun kepada parpol yang mengambil jalan mengusung capres berbeda dari harapan teman-teman parpol pemerintah lainnya, menunjukkan ada kecenderungan upaya konsolidasi kekuasaan oleh oligarki, agar tidak boleh ada sosok lain di luar kelompok mereka untuk tampil ke permukaan dan berlaga di kontestasi 2024,\" kata Herzaky Mahendra Putra, Jumat (14/10/2022)."
                        + "\n" + "Herzaky berharap, Presiden Joko Widodo (Jokowi) dan jajarannya mengedepankan sikap negarawan dan tidak melakukan intimidasi terhadap partai politik yang mengusung calon pemimpin harapan rakyat.\n" +
                        "\n" +
                        "\"Jangan malah Presiden atau para pembantunya sok-sokan mencoba mengkooptasi, menggergaji hak dan kewenangan parpol sebagai entitas berdaulat di negeri ini, dengan memberikan tekanan atau intimidasi kepada parpol yang sedang berupaya melaksanakan tugas dan tanggung jawab politiknya kepada rakyat dengan mengusung calon pemimpin negeri di Pilpres 2024 sesuai dengan harapan dan aspirasi rakyat ataupun konstituennya,\" ucap Herzaky.\n" +
                        "\n" +
                        "Ia melihat, situasi perpolitikan saat ini seolah-olah demokrasi di Indonesia diatur oleh sekelompok elite dan golongan saja.\n" +
                        "\n" +
                        "\"Seakan-akan negeri ini milik sendiri. Seakan-akan, semuanya harus dibaku atur oleh segelintir elit saja. Jika benar ini yang terjadi, demokrasi Indonesia yang sudah rapuh 8 tahun ini, menjadi semakin bobrok,\" ucap Herzaky.\n" +
                        "\n" +
                        "Partai Demokrat disebutkan Herzaky, akan mengawal demokrasi Indonesia, agar semakin berkembang dan matang. Pihaknya juga akan melawan jika ada upaya oligarki mengambil alih kedaulatan rakyat dan berusaha mengintervensi parpol sebagai salah satu pilar demokrasi.\n" +
                        "\n" +
                        "\"Demokrat seperti yang selalu ditegaskan oleh Ketua Umum Agus Harimurti Yudhoyono dalam berbagai kesempatan, akan terus konsisten bersama rakyat, memperjuangkan perubahan dan perbaikan,\" pungkas Herzaky Mahendra Putra.\n" +
                        "\n" +
                        "Sebagaimana diketahui, isu reshuffle bermula dari pernyataan relawan Jokowi yang menyebutkan perlu dilakukan pergantian Menteri pasca penetapan Anies Baswedan sebagai Capres dari Partai Nasdem yang merupakan partai koalisi pemerintah di era Jokowi-Ma'ruf Amin.\n" +
                        "\n" +
                        "Presiden Jokowi saat ditanyai terkait rencana reshuffle menyebutkan kemungkinan tersebut selalu ada.\n" +
                        "\n" +
                        "\"Rencana selalu ada. Pelaksanaan nanti diputuskan,\" kata Jokowi saat ditanya wartawan soal apakah ada rencana reshuffle kabinet saat meninjau Stasiun Kereta Cepat Indonesia China di Stasiun Kereta Cepat Tegalluar, Cileunyi, Kabupaten Bandung, Kamis (13/10/2022).",

                "JAKARTA - Kabar menteri-menteri dari kader Partai Nasdem akan di-reshuffle oleh Presiden Joko Widodo (Jokowi) santer terdengar, setelah Ketua DPP Nasdem Zulfan Lindan menyebut Anies Baswedan sebagai antitesis Jokowi.\n" +
                        "\n" +
                        "Menanggapi hal ini, Ketua DPP PPP Achmad Baidowi mengatakan, reshuffle kabinet itu sejatinya merupakan hak prerogatif presiden.\n" +
                        "\n" +
                        "Namun jika reshuffle ini dikaitkan dengan Nasdem, ia jadi teringat kondisi periode pertama pemerintahan Jokowi, yang mana ada menteri dari sebuah parpol yang memilih mundur dari kabinet karena berseberangan dengan pemerintah.\n" +
                        "\n" +
                        "\"Itu hak prerogatif Presiden Jokowi ya soal reshuffle, tetapi kalau memang... Begini, dulu ada parpol ketika tidak sejalan dengan pemerintahan dan memilih berseberangan, maka parpol tersebut mundur dari kabinet, itu yang periode lalu, enggak tahu kalau sekarang,\" kata pria yang akrab disapa Awiek ini saat dihubungi, Jumat (14/10/2022)." +
                        "\n" + "Diketahui, pada pertengahan 2018 lalu atau bertepatan dengan pendaftaran capres dan cawapres ke Komisi Pemilihan Umum (KPU), Menteri PAN RB yang juga kader PAN Asman Abnur, memilih mundur setelah santer kabar dirinya akan di-reshuffle lantaran PAN mengusung Prabowo-Sandi di Pilpres 2019.\n" +
                        "\n" +
                        "Terkait Nasdem yang mendapat banyak kritikan dari parpol koalisi termasuk PDIP, Awiek melihat, Nasdem tidak disudutkan melainkan NasDem yang membuat blunder dengan salah satu elitenya yang menyebut Anies antitesis Jokowi, sehingga menciptakan konfrontasinya sendiri.\n" +
                        "\n" +
                        "Kalau soal dukungan capres-cawapres masih panjang prosesnya, tapi yang jadi soal adalah pernyataan tentang antitesis kepemimpinan yang kian memperkeruh hubungan Nasdem dan PDIP.\n" +
                        "\n" +
                        "\"Kalau soal capres-cawapres itu kan masih panjang, dan belum tentu juga, calon-calon presiden itu bisa berangkat karena harus memenuhi tiket 20% kursi atau 25% suara. Namun pernyataan-pernyataan yang blunder itu membuat situasi memanas, khusunya hubungan PDIP dengan Nasdem, terkait dengan tesis antitesis, kepemimpinan antitesis itu lho,\" terangnya.\n" +
                        "\n" +
                        "Menurut Wakil Ketua Baleg DPR ini, kalau dalam konteks hubungan antar parpol, hubungan Nasdem dengan PDIP pada dasarnya tidak ada masalah, tetapi kalau konteks hubungan koalisi tentu hubungannya antara Nasdem dengan Jokowi, karena Nasdem bagian koalisi pemerintah.\n" +
                        "\n" +
                        "\"Kalau hubungan dengan sesama koalisi tentu itu kan hubungannya Nasdem dengan Jokowi, kan koalisinya di situ,\" ujarnya.\n" +
                        "\n" +
                        "Namun demikian, Awiek menyayangkan kalimat seperti itu keluar ke publik, apalagi pernyataan Anies antitesis Jokowi itu keluar dari seorang politikus, bukan pengamat politik.\n" +
                        "\n" +
                        "\"Bahasa, kalimat antitesa dari Jokowi, itu kan tidak etis sebenarnya, kalau tesa antitesa kan gampang, kalau tesanya kenyang, antitesanya lapar, kan gitu. Karena apa, Pak Zulfan itu pelaku politik, kecuali yang berstatement itu atau menganalisa, itu pengamat,\" pungkasnya",

                "JAKARTA - Wakil Ketua Majelis Syura PKS Hidayat Nur Wahid (HNW) menilai Gubernur DKI Jakarta Anies Baswedan sebagai pemimpin yang baik, karena mampu mendatangkan kemaslahatan umat.\n" +
                        "\n" +
                        "Menurut HNW, Anies berhasil menggunakan kekuasaannya dengan baik dan benar, sehingga memberikan manfaat bagi masyarakat.Salah satunya saat orang nomor satu di DKI Jakarta itu berhasil menutup Alexis pada 2018 silam.\n" +
                        "\n" +
                        "”Dalam konteks Jakarta, kita pernah mengalami suatu peristiwa di mana ketika Pak Anies dimenangkan warga Jakarta sebagai Gubernur DKI, ada kawasan masih pada ingat kali ya apa itu? Hotel Alexis,” kata Hidayat di Balai Kota DKI Jakarta, Kamis (13/10/2022). Baca juga: Anies hingga Politikus PKS Hadiri Istighosah Jawara di Balai Kota\n" +
                        "\n" +
                        "Sebelum Anies menjadi Gubernur, kata HNW, tempat hiburan malam tersebut tetap bertahan meskipun banyak desakan untuk tutup. Bahkan HNW menyebut, berbagai nasehat hingga ceramah pemuka agama pun tidak membuat Alexis tutup.\n" +
                        "\n" +
                        "”Jadi betapa banyak khotbah disampaikan, ceramah agama disampaikan, nasehat disampaikan, istigosah dilakukan dan mungkin juga demo untuk menutup Hotel Alexis nggak tutup tutup. Bahkan ada dulu yang bilang itu kang surga, surganya siapa?,” katanya.\n" +
                        "\n" +
                        "”Tetapi ketika kemudian hadirlah pemimpin yang dimenangkan oleh rakyat pak Anies Baswedan, ketika itu tidak lagi diperlukan istigosah ceramah khotbah demo, cukup beliau tidak menandatangani perpanjangan izin, maka Alexis berhenti,” sambungnya." + "\n" +
                        "Wakil Ketua MPR RI itu menyinggung pernyataan para ulama yang menyebut bahwa pemimpin baik akan membawa kebaikan untuk bangsa dan negara." + "\n" +
                        "”Salah satu gambaran dari benarnya apa yang disampaikan para ulama, bahwa pemimpin yang baik, pemimpin yang benar akan efektif menghadirkan kemaslahatan bagi umat, bagi bangsa dan negara,” ungkapnya.\n" +
                        "\n" +
                        "”Dan karena hanya pemimpin yang baik ini penting untuk kemudian selalu bisa dihadirkan didukung, dikuatkan supaya kebaikannya, akan selalu hadir dan semakin kuat semakin banyak yang menikmatinya,” tukasnya.",

                "Jakarta, CNN Indonesia -- Ketua DPP Partai NasDem Teuku Taufiqulhadi mengatakan pengurus pusat partainya telah menginstruksikan seluruh struktur partai di daerah memasang spanduk dan baliho pencalonan Anies Baswedan sebagai calon presiden.\n" +
                        "\"Benar kami diinstruksikan DPP buat spanduk atau baliho Anies sebagai capres. Itu sudah diinstruksikan,\" kata Taufiqulhadi kepada CNNIndonesia.com, Jumat (14/10).\n" +
                        "\n" +
                        "Taufiqulhadi mengklaim instruksi itu sudah dilaksanakan dengan baik oleh para pengurus daerah." + "\n" +
                        "\"Itu DPW disampaikan DPD tingkat kabupaten, dan DPD sampaikan kepada pengurus di tingkat kecamatan atau DPC,\" kata dia." + "\n" +
                        "Taufiqulhadi mengatakan instruksi itu untuk menindaklanjuti dukungan NasDem terhadap Anies. Karenanya, dukungan itu perlu disosialisasikan kepada masyarakat luas di penjuru Indonesia. Sehingga, gaung Anies sebagai capres bisa diterima oleh masyarakat.\n" +
                        "\n" +
                        "\"Maka kita harus sosialisasikan. Itu keputusan. Kita gaungkan, karena sudah diputuskan DPP. Rasanya mendapatkan antusiasme yang tinggi dari DPW dan DPD,\" kata dia.\n" +
                        "\n" +
                        "Diketahui, Anies sudah dideklarasikan oleh NasDem sebagai calon presiden untuk maju di Pilpres 2024. Pengumuman itu diumumkan langsung oleh Ketum NasDem Surya Paloh di NasDem Tower, Jakarta Pusat pada 3 Oktober 2022 lalu.\n" +
                        "\n" +
                        "NasDem tak bisa sendirian mengusung calon presiden untuk maju di Pilpres 2024. Pasalnya, NasDem hanya meraih 9,05 persen suara pada Pemilu 2019.\n" +
                        "\n" +
                        "Sementara syarat ambang batas pencalonan presiden yaitu memiliki 25 persen suara sah nasional atau 20 persen kursi di DPR. NasDem harus mencari rekan koalisi parpol lain untuk mengusung Anies."
        };

        String arrUsia13[]={
            "SU", "SU", "SU", "SU", "SU"
        };

        String arrTgl13[]={
                "Jumat, 14 Okt 2022 14:25 WIB",
                "Jumat, 14 Okt 2022 11:59 WIB",
                "Jumat, 14 Okt 2022 09:04 WIB",
                "Jumat, 14 Okt 2022 08:14 WIB",
                "Jumat, 14 Okt 2022 11:22 WIB"

        };

        int arrImage13[]={
            R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5
        };

        String arrJudul[]={
                "Pilpres 2024, PAN Tegaskan Realistis dan Ingin Menang",

                "Isu Reshuffle Kabinet Dinilai Bentuk Tekanan Politik dari Oligarki",

                "Kabar Reshuffle Kabinet, PPP Teringat PAN yang Mundur karena Berseberangan",

                "Berhasil Tutup Alexis, HNW Puji Anies Pemimpin Baik Datangkan Kemaslahatan Umat",

                "NasDem Instruksikan Pengurus Daerah Pasang Spanduk Anies Capres",

                "Suhu Politik Memanas, Sikapi dengan Bijak"
        };

        String arrKategori[]={
                "Pemilu", "Pemerintah", "Pemerintah", "Pemilu", "Pemilu", "Pemilu"
        };

        String arrKonten[]={
                "JAKARTA - Sekretaris Jenderal (Sekjen) DPP PAN Eddy Soeparno menyampaikan, hasil Rakernas PAN sudah mengumumkan sembilan nama bakal Capres 2024. Sembilan nama ini akan dikerucutkan menjadi tiga atau lima nama.\n" +
                        "\n" +
                        "\"Akan kita kerucutkan nanti nama-nama tersebut menjadi 3 atau 5 nama dalam Rapimnas, yang akan kita laksanakan dalam waktu dekat,\" kata Eddy saat menerima kunjungan PSI di Kantor DPP PAN di Jakarta, Kamis (13/10/2022) malam.\n" +
                        "\n" +
                        "Kemudian Eddy menjelaskan, PAN akan membicarakan soal capres dan cawapres dengan teman-teman di Koalisi Indonesia Bersatu (KIB) yakni Partai Golkar dan PPP, untuk kemudian diputuskan bersama.\n" +
                        "\n" +
                        "\"Berdasarkan kesepahaman yang kita miliki bersama teman-teman KIB, kita akan bicarakan dengan Golkar dengan PPP. Ayok ini gimana nih, nama-nama ini gitu,\" terang Eddy." + "\n" +
                        "Olen karena itu Eddy menjelaskan, sejauh ini KIB masih saling tukar pikiran, dan sepakat untuk memberikan kesempatan bagi putra putri terbaik Indonesia untuk berkontestasi. Semakin banyak calon akan lebih bagus, karena masyarakat bisa punya pilihan.\n" +
                        "\n" +
                        "\"Kita ingin partisipasi masyarakat di dalam pemilu dan pilpres ke depan sangat tinggi, sehingga mereka juga bisa mampu mengetahui, mampu mengkritisi betul-betul membedah siapa calon-calon yang akan diajukan nantinya,\" jelasnya.\n" +
                        "\n" +
                        "\"Kita juga punya mekanisme internal dan umumkan nanti siapa, dan kita punya mekanisme di dalam KIB untuk nanti diumumkan, siapa saja yang diajukan,\" imbuh Wakil Ketua Komisi VII DPR ini."
                        + "\n" + "Soal Ketum PAN Zulkifli Hasan dan Ketum Golkar Airlangga Hartarto yang didorong menjadi capres, Eddy menerangkan, bagi sebuah partai, merupakan kebanggaan jika kader terbaik maju dalam Pilpres, tak terkecuali Golkar, PPP, maupun PAN.\n" +
                        "\n" +
                        "Jadi menurutnya, kalau PAN ditanya hari ini siapa yang akan dimajukan, tentu PAN akan mendorong putra terbaik PAN Zulkifli Hasan. Tetapi, PAN realistis karena ingin menang di Pilpres 2024.\n" +
                        "\n" +
                        "\"Tetapi kita mau realistis. Pilpres mau apa? Ya mau menang, bagaimana formulasi menangnya, ya inilah yang akan kita bahas sama-sama,\" tandasnya.\n",

                "JAKARTA - Wacana pergantian menteri atau reshuffle kabinet dinilai sebagai salah satu bentuk tekanan politik oligarki terhadap sistem demokrasi. Hal ini ditegaskan oleh Kepala Badan Komunikasi Strategis DPP/Koordinator Juru Bicara DPP Partai Demokrat, Herzaky Mahendra Putra.\n" +
                        "\n" +
                        "\"Tekanan, intimidasi, paksaan dalam bentuk apapun kepada parpol yang mengambil jalan mengusung capres berbeda dari harapan teman-teman parpol pemerintah lainnya, menunjukkan ada kecenderungan upaya konsolidasi kekuasaan oleh oligarki, agar tidak boleh ada sosok lain di luar kelompok mereka untuk tampil ke permukaan dan berlaga di kontestasi 2024,\" kata Herzaky Mahendra Putra, Jumat (14/10/2022)."
                        + "\n" + "Herzaky berharap, Presiden Joko Widodo (Jokowi) dan jajarannya mengedepankan sikap negarawan dan tidak melakukan intimidasi terhadap partai politik yang mengusung calon pemimpin harapan rakyat.\n" +
                        "\n" +
                        "\"Jangan malah Presiden atau para pembantunya sok-sokan mencoba mengkooptasi, menggergaji hak dan kewenangan parpol sebagai entitas berdaulat di negeri ini, dengan memberikan tekanan atau intimidasi kepada parpol yang sedang berupaya melaksanakan tugas dan tanggung jawab politiknya kepada rakyat dengan mengusung calon pemimpin negeri di Pilpres 2024 sesuai dengan harapan dan aspirasi rakyat ataupun konstituennya,\" ucap Herzaky.\n" +
                        "\n" +
                        "Ia melihat, situasi perpolitikan saat ini seolah-olah demokrasi di Indonesia diatur oleh sekelompok elite dan golongan saja.\n" +
                        "\n" +
                        "\"Seakan-akan negeri ini milik sendiri. Seakan-akan, semuanya harus dibaku atur oleh segelintir elit saja. Jika benar ini yang terjadi, demokrasi Indonesia yang sudah rapuh 8 tahun ini, menjadi semakin bobrok,\" ucap Herzaky.\n" +
                        "\n" +
                        "Partai Demokrat disebutkan Herzaky, akan mengawal demokrasi Indonesia, agar semakin berkembang dan matang. Pihaknya juga akan melawan jika ada upaya oligarki mengambil alih kedaulatan rakyat dan berusaha mengintervensi parpol sebagai salah satu pilar demokrasi.\n" +
                        "\n" +
                        "\"Demokrat seperti yang selalu ditegaskan oleh Ketua Umum Agus Harimurti Yudhoyono dalam berbagai kesempatan, akan terus konsisten bersama rakyat, memperjuangkan perubahan dan perbaikan,\" pungkas Herzaky Mahendra Putra.\n" +
                        "\n" +
                        "Sebagaimana diketahui, isu reshuffle bermula dari pernyataan relawan Jokowi yang menyebutkan perlu dilakukan pergantian Menteri pasca penetapan Anies Baswedan sebagai Capres dari Partai Nasdem yang merupakan partai koalisi pemerintah di era Jokowi-Ma'ruf Amin.\n" +
                        "\n" +
                        "Presiden Jokowi saat ditanyai terkait rencana reshuffle menyebutkan kemungkinan tersebut selalu ada.\n" +
                        "\n" +
                        "\"Rencana selalu ada. Pelaksanaan nanti diputuskan,\" kata Jokowi saat ditanya wartawan soal apakah ada rencana reshuffle kabinet saat meninjau Stasiun Kereta Cepat Indonesia China di Stasiun Kereta Cepat Tegalluar, Cileunyi, Kabupaten Bandung, Kamis (13/10/2022).",

                "JAKARTA - Kabar menteri-menteri dari kader Partai Nasdem akan di-reshuffle oleh Presiden Joko Widodo (Jokowi) santer terdengar, setelah Ketua DPP Nasdem Zulfan Lindan menyebut Anies Baswedan sebagai antitesis Jokowi.\n" +
                        "\n" +
                        "Menanggapi hal ini, Ketua DPP PPP Achmad Baidowi mengatakan, reshuffle kabinet itu sejatinya merupakan hak prerogatif presiden.\n" +
                        "\n" +
                        "Namun jika reshuffle ini dikaitkan dengan Nasdem, ia jadi teringat kondisi periode pertama pemerintahan Jokowi, yang mana ada menteri dari sebuah parpol yang memilih mundur dari kabinet karena berseberangan dengan pemerintah.\n" +
                        "\n" +
                        "\"Itu hak prerogatif Presiden Jokowi ya soal reshuffle, tetapi kalau memang... Begini, dulu ada parpol ketika tidak sejalan dengan pemerintahan dan memilih berseberangan, maka parpol tersebut mundur dari kabinet, itu yang periode lalu, enggak tahu kalau sekarang,\" kata pria yang akrab disapa Awiek ini saat dihubungi, Jumat (14/10/2022)." +
                        "\n" + "Diketahui, pada pertengahan 2018 lalu atau bertepatan dengan pendaftaran capres dan cawapres ke Komisi Pemilihan Umum (KPU), Menteri PAN RB yang juga kader PAN Asman Abnur, memilih mundur setelah santer kabar dirinya akan di-reshuffle lantaran PAN mengusung Prabowo-Sandi di Pilpres 2019.\n" +
                        "\n" +
                        "Terkait Nasdem yang mendapat banyak kritikan dari parpol koalisi termasuk PDIP, Awiek melihat, Nasdem tidak disudutkan melainkan NasDem yang membuat blunder dengan salah satu elitenya yang menyebut Anies antitesis Jokowi, sehingga menciptakan konfrontasinya sendiri.\n" +
                        "\n" +
                        "Kalau soal dukungan capres-cawapres masih panjang prosesnya, tapi yang jadi soal adalah pernyataan tentang antitesis kepemimpinan yang kian memperkeruh hubungan Nasdem dan PDIP.\n" +
                        "\n" +
                        "\"Kalau soal capres-cawapres itu kan masih panjang, dan belum tentu juga, calon-calon presiden itu bisa berangkat karena harus memenuhi tiket 20% kursi atau 25% suara. Namun pernyataan-pernyataan yang blunder itu membuat situasi memanas, khusunya hubungan PDIP dengan Nasdem, terkait dengan tesis antitesis, kepemimpinan antitesis itu lho,\" terangnya.\n" +
                        "\n" +
                        "Menurut Wakil Ketua Baleg DPR ini, kalau dalam konteks hubungan antar parpol, hubungan Nasdem dengan PDIP pada dasarnya tidak ada masalah, tetapi kalau konteks hubungan koalisi tentu hubungannya antara Nasdem dengan Jokowi, karena Nasdem bagian koalisi pemerintah.\n" +
                        "\n" +
                        "\"Kalau hubungan dengan sesama koalisi tentu itu kan hubungannya Nasdem dengan Jokowi, kan koalisinya di situ,\" ujarnya.\n" +
                        "\n" +
                        "Namun demikian, Awiek menyayangkan kalimat seperti itu keluar ke publik, apalagi pernyataan Anies antitesis Jokowi itu keluar dari seorang politikus, bukan pengamat politik.\n" +
                        "\n" +
                        "\"Bahasa, kalimat antitesa dari Jokowi, itu kan tidak etis sebenarnya, kalau tesa antitesa kan gampang, kalau tesanya kenyang, antitesanya lapar, kan gitu. Karena apa, Pak Zulfan itu pelaku politik, kecuali yang berstatement itu atau menganalisa, itu pengamat,\" pungkasnya",

                "JAKARTA - Wakil Ketua Majelis Syura PKS Hidayat Nur Wahid (HNW) menilai Gubernur DKI Jakarta Anies Baswedan sebagai pemimpin yang baik, karena mampu mendatangkan kemaslahatan umat.\n" +
                        "\n" +
                        "Menurut HNW, Anies berhasil menggunakan kekuasaannya dengan baik dan benar, sehingga memberikan manfaat bagi masyarakat.Salah satunya saat orang nomor satu di DKI Jakarta itu berhasil menutup Alexis pada 2018 silam.\n" +
                        "\n" +
                        "”Dalam konteks Jakarta, kita pernah mengalami suatu peristiwa di mana ketika Pak Anies dimenangkan warga Jakarta sebagai Gubernur DKI, ada kawasan masih pada ingat kali ya apa itu? Hotel Alexis,” kata Hidayat di Balai Kota DKI Jakarta, Kamis (13/10/2022). Baca juga: Anies hingga Politikus PKS Hadiri Istighosah Jawara di Balai Kota\n" +
                        "\n" +
                        "Sebelum Anies menjadi Gubernur, kata HNW, tempat hiburan malam tersebut tetap bertahan meskipun banyak desakan untuk tutup. Bahkan HNW menyebut, berbagai nasehat hingga ceramah pemuka agama pun tidak membuat Alexis tutup.\n" +
                        "\n" +
                        "”Jadi betapa banyak khotbah disampaikan, ceramah agama disampaikan, nasehat disampaikan, istigosah dilakukan dan mungkin juga demo untuk menutup Hotel Alexis nggak tutup tutup. Bahkan ada dulu yang bilang itu kang surga, surganya siapa?,” katanya.\n" +
                        "\n" +
                        "”Tetapi ketika kemudian hadirlah pemimpin yang dimenangkan oleh rakyat pak Anies Baswedan, ketika itu tidak lagi diperlukan istigosah ceramah khotbah demo, cukup beliau tidak menandatangani perpanjangan izin, maka Alexis berhenti,” sambungnya." + "\n" +
                        "Wakil Ketua MPR RI itu menyinggung pernyataan para ulama yang menyebut bahwa pemimpin baik akan membawa kebaikan untuk bangsa dan negara." + "\n" +
                        "”Salah satu gambaran dari benarnya apa yang disampaikan para ulama, bahwa pemimpin yang baik, pemimpin yang benar akan efektif menghadirkan kemaslahatan bagi umat, bagi bangsa dan negara,” ungkapnya.\n" +
                        "\n" +
                        "”Dan karena hanya pemimpin yang baik ini penting untuk kemudian selalu bisa dihadirkan didukung, dikuatkan supaya kebaikannya, akan selalu hadir dan semakin kuat semakin banyak yang menikmatinya,” tukasnya.",

                "Jakarta, CNN Indonesia -- Ketua DPP Partai NasDem Teuku Taufiqulhadi mengatakan pengurus pusat partainya telah menginstruksikan seluruh struktur partai di daerah memasang spanduk dan baliho pencalonan Anies Baswedan sebagai calon presiden.\n" +
                        "\"Benar kami diinstruksikan DPP buat spanduk atau baliho Anies sebagai capres. Itu sudah diinstruksikan,\" kata Taufiqulhadi kepada CNNIndonesia.com, Jumat (14/10).\n" +
                        "\n" +
                        "Taufiqulhadi mengklaim instruksi itu sudah dilaksanakan dengan baik oleh para pengurus daerah." + "\n" +
                        "\"Itu DPW disampaikan DPD tingkat kabupaten, dan DPD sampaikan kepada pengurus di tingkat kecamatan atau DPC,\" kata dia." + "\n" +
                        "Taufiqulhadi mengatakan instruksi itu untuk menindaklanjuti dukungan NasDem terhadap Anies. Karenanya, dukungan itu perlu disosialisasikan kepada masyarakat luas di penjuru Indonesia. Sehingga, gaung Anies sebagai capres bisa diterima oleh masyarakat.\n" +
                        "\n" +
                        "\"Maka kita harus sosialisasikan. Itu keputusan. Kita gaungkan, karena sudah diputuskan DPP. Rasanya mendapatkan antusiasme yang tinggi dari DPW dan DPD,\" kata dia.\n" +
                        "\n" +
                        "Diketahui, Anies sudah dideklarasikan oleh NasDem sebagai calon presiden untuk maju di Pilpres 2024. Pengumuman itu diumumkan langsung oleh Ketum NasDem Surya Paloh di NasDem Tower, Jakarta Pusat pada 3 Oktober 2022 lalu.\n" +
                        "\n" +
                        "NasDem tak bisa sendirian mengusung calon presiden untuk maju di Pilpres 2024. Pasalnya, NasDem hanya meraih 9,05 persen suara pada Pemilu 2019.\n" +
                        "\n" +
                        "Sementara syarat ambang batas pencalonan presiden yaitu memiliki 25 persen suara sah nasional atau 20 persen kursi di DPR. NasDem harus mencari rekan koalisi parpol lain untuk mengusung Anies.",

                "MESKIPUN pemilihan umum (pemilu) termasuk pemilihan presiden dan wakil presiden baru akan dihelat 16 bulan lagi, namun tensi dan suhu politik mulai memanas. Narasi-narasi memecah belah dengan diksi intoleran, antikeberagaman, bahkan radikalisme kembali dimunculkan. Ruang publik kini mulai dipenuhi oleh umpatan, hujatan dan narasi adu domba.\n" +
                        "\n" +
                        "Belajar dari dua perhelatan pemilu sebelumnya, sejatinya masyarakat sudah harus dan wajib paham bahwa narasi-narasi yang patut diduga dilakukan oleh kelompok-kelompok tertentu itu adalah lagu lama yang diputar kembali. Dari pengalaman sebelumnya pula, masyarakat perlu sadar bahwa jargon-jargon intoleran, dan antikeberagaman sejatinya hanyalah alat politik pihak-pihak tertentu." + "\n"
                        + "Tensi dan suhu politik bisa jadi akan semakin tinggi di awal tahun depan, mengingat partai politik diperkirakan akan menentukan siapa calon yang akan diusung untuk menjadi capres dan cawapres untuk lima tahun kedepannya.\n" +
                        "\n" +
                        "Perlu kesadaran dari masyarakat, termasuk para elite politik untuk memberikan edukasi politik yang masif kepada masyarakat dan para kontestan politik, agar tidak terprovokasi oleh kepentingan-kepentingan politik yang tidak bermanfaat.\n" +
                        "\n" +
                        "Penting juga untuk melakukan peningkatan literasi politik di kalangan masyarakat dalam menyambut pemilihan umum 2024.\n" +
                        "\n" +
                        "Tahun 2023 dipastikan akan mulai riuh dengan kontestasi, persaingan, dan manuver dari berbagai partai politik serta elite politik untuk menaikkan citra dari masing-masing partai dan meraup dukungan masyarakat.\n" +
                        "\n" +
                        "Sehingga berpotensi diwarnai oleh berbagai isu politik, seperti isu korupsi, isu politik uang, dan berbagai isu lainnya termasuk isu SARA dengan kontra propaganda yang berpotensi mencederai kehidupan berdemokrasi di Indonesia.\n" +
                        "\n" +
                        "Karenanya, penting untuk melakukan peningkatan literasi politik bagi masyarakat untuk mengantisipasi berbagai isu yang akan mencuat di media sosial maupun media massa.\n" +
                        "\n" +
                        "Terlebih karakteristik nilai-nilai demokrasi yang bersifat dinamis dan berubah-ubah, sesuai dengan perkembangan zaman sehingga memang perlu untuk terus menyampaikan nilai-nilai demokrasi yang bermartabat dari generasi ke generasi.\n" + "\n" +
                        "Pendidikan politik kepada masyarakat dapat menciptakan kehidupan demokrasi yang sehat dan mewujudkan masyarakat Indonesia yang cerdas dan dewasa dalam berpolitik.\n" +
                        "\n" +
                        "Pemilih rasional yang cerdas dan kritis secara sederhana dapat digambarkan sebagai pemilih yang bukan saja memiliki pengetahuan dan kesadaran elektoral melainkan juga bebas dari berbagai bentuk intimidasi.\n" +
                        "\n" +
                        "Memiliki daya tahan terhadap serangan atau bujukan transaksional yang tidak sehat dan melanggar aturan seperti politik uang. Serta memahami betul arti penting suara yang mereka miliki dan konsekuensi politik dari pilihannya di kemudian hari.\n" +
                        "\n" +
                        "Untuk meningkatkan kecerdasan dan daya kritis para pemilih pemula, berbagai pihak khususnya KPU dan Bawaslu sebagai penyelenggara pemilu, pemerintah maupun peserta pemilu (khususnya partai politik) perlu memperkuat upaya pendidikan pemilih terutama melalui kegiatan-kegiatan sosialisasi.\n" +
                        "\n" +
                        "Senab, selama ini, edukasi yang diberika beljm memberikan dampak yang berarti untuk menumbuhkan kecerdasan dan daya kritis pemilih pemula. Secara umum sosialisasi pemilu hanya berhasil meningkatkan pengetahuan dan kesadaran teknis elektoral seperti kapan, dimana dan bagaimana cara memberikan suara pada hari dan tanggal pemungutan suara dilakukan.\n" +
                        "\n" +
                        "Sementara aspek-aspek substantif elektoral seperti arti penting setiap suara yang diberikan, pentingnya membangun otonomi dan kemandirian politik, dampak buruk dari praktik-praktik transaksi politik yang tidak sehat seperti money politics, dan dampak atau konsekuensi pilihan politik di kemudian hari, cenderung terabaikan dan gagal ditumbuhkan secara masif sebagai bentuk kesadaran substantif di kalangan pemilih pemula.\n" +
                        "\n" +
                        "Memilih calon anggota legislatif hingga capres dan cawapres perlu dilakukan dengan rasional, tidak emosional dan sektarian. Hal itu penting agar pemimpin yang terpilih mampu membawa bangsa ke arah yang lebih baik bagi kesejahteraan dan kemakmuran rakyat."

        };

        String arrUsia[]={
                "SU", "SU", "SU", "SU", "SU", "13+"
        };

        String arrTgl[]={
                "Jumat, 14 Okt 2022 14:25 WIB",
                "Jumat, 14 Okt 2022 11:59 WIB",
                "Jumat, 14 Okt 2022 09:04 WIB",
                "Jumat, 14 Okt 2022 08:14 WIB",
                "Jumat, 14 Okt 2022 11:22 WIB",
                "Kamis, 13 Okt 2022 23:25 WIB"

        };

        int arrImage[]={
                R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6
        };

        String arrJudul17[]={
                "Pilpres 2024, PAN Tegaskan Realistis dan Ingin Menang",

                "Isu Reshuffle Kabinet Dinilai Bentuk Tekanan Politik dari Oligarki",

                "Kabar Reshuffle Kabinet, PPP Teringat PAN yang Mundur karena Berseberangan",

                "Berhasil Tutup Alexis, HNW Puji Anies Pemimpin Baik Datangkan Kemaslahatan Umat",

                "NasDem Instruksikan Pengurus Daerah Pasang Spanduk Anies Capres",

                "Suhu Politik Memanas, Sikapi dengan Bijak",

                "KPU Umumkan Daftar 18 Partai Lolos Verifikasi Pemilu 2024"

        };

        String arrKategori17[]={
                "Pemilu", "Pemerintah", "Pemerintah", "Pemilu", "Pemilu", "Pemilu", "Pemilu"
        };

        String arrKonten17[]={
                "JAKARTA - Sekretaris Jenderal (Sekjen) DPP PAN Eddy Soeparno menyampaikan, hasil Rakernas PAN sudah mengumumkan sembilan nama bakal Capres 2024. Sembilan nama ini akan dikerucutkan menjadi tiga atau lima nama.\n" +
        "\n" +
                "\"Akan kita kerucutkan nanti nama-nama tersebut menjadi 3 atau 5 nama dalam Rapimnas, yang akan kita laksanakan dalam waktu dekat,\" kata Eddy saat menerima kunjungan PSI di Kantor DPP PAN di Jakarta, Kamis (13/10/2022) malam.\n" +
                "\n" +
                "Kemudian Eddy menjelaskan, PAN akan membicarakan soal capres dan cawapres dengan teman-teman di Koalisi Indonesia Bersatu (KIB) yakni Partai Golkar dan PPP, untuk kemudian diputuskan bersama.\n" +
                "\n" +
                "\"Berdasarkan kesepahaman yang kita miliki bersama teman-teman KIB, kita akan bicarakan dengan Golkar dengan PPP. Ayok ini gimana nih, nama-nama ini gitu,\" terang Eddy." + "\n" +
                "Olen karena itu Eddy menjelaskan, sejauh ini KIB masih saling tukar pikiran, dan sepakat untuk memberikan kesempatan bagi putra putri terbaik Indonesia untuk berkontestasi. Semakin banyak calon akan lebih bagus, karena masyarakat bisa punya pilihan.\n" +
                "\n" +
                "\"Kita ingin partisipasi masyarakat di dalam pemilu dan pilpres ke depan sangat tinggi, sehingga mereka juga bisa mampu mengetahui, mampu mengkritisi betul-betul membedah siapa calon-calon yang akan diajukan nantinya,\" jelasnya.\n" +
                "\n" +
                "\"Kita juga punya mekanisme internal dan umumkan nanti siapa, dan kita punya mekanisme di dalam KIB untuk nanti diumumkan, siapa saja yang diajukan,\" imbuh Wakil Ketua Komisi VII DPR ini."
                + "\n" + "Soal Ketum PAN Zulkifli Hasan dan Ketum Golkar Airlangga Hartarto yang didorong menjadi capres, Eddy menerangkan, bagi sebuah partai, merupakan kebanggaan jika kader terbaik maju dalam Pilpres, tak terkecuali Golkar, PPP, maupun PAN.\n" +
                "\n" +
                "Jadi menurutnya, kalau PAN ditanya hari ini siapa yang akan dimajukan, tentu PAN akan mendorong putra terbaik PAN Zulkifli Hasan. Tetapi, PAN realistis karena ingin menang di Pilpres 2024.\n" +
                "\n" +
                "\"Tetapi kita mau realistis. Pilpres mau apa? Ya mau menang, bagaimana formulasi menangnya, ya inilah yang akan kita bahas sama-sama,\" tandasnya.\n",

                "JAKARTA - Wacana pergantian menteri atau reshuffle kabinet dinilai sebagai salah satu bentuk tekanan politik oligarki terhadap sistem demokrasi. Hal ini ditegaskan oleh Kepala Badan Komunikasi Strategis DPP/Koordinator Juru Bicara DPP Partai Demokrat, Herzaky Mahendra Putra.\n" +
                        "\n" +
                        "\"Tekanan, intimidasi, paksaan dalam bentuk apapun kepada parpol yang mengambil jalan mengusung capres berbeda dari harapan teman-teman parpol pemerintah lainnya, menunjukkan ada kecenderungan upaya konsolidasi kekuasaan oleh oligarki, agar tidak boleh ada sosok lain di luar kelompok mereka untuk tampil ke permukaan dan berlaga di kontestasi 2024,\" kata Herzaky Mahendra Putra, Jumat (14/10/2022)."
                        + "\n" + "Herzaky berharap, Presiden Joko Widodo (Jokowi) dan jajarannya mengedepankan sikap negarawan dan tidak melakukan intimidasi terhadap partai politik yang mengusung calon pemimpin harapan rakyat.\n" +
                        "\n" +
                        "\"Jangan malah Presiden atau para pembantunya sok-sokan mencoba mengkooptasi, menggergaji hak dan kewenangan parpol sebagai entitas berdaulat di negeri ini, dengan memberikan tekanan atau intimidasi kepada parpol yang sedang berupaya melaksanakan tugas dan tanggung jawab politiknya kepada rakyat dengan mengusung calon pemimpin negeri di Pilpres 2024 sesuai dengan harapan dan aspirasi rakyat ataupun konstituennya,\" ucap Herzaky.\n" +
                        "\n" +
                        "Ia melihat, situasi perpolitikan saat ini seolah-olah demokrasi di Indonesia diatur oleh sekelompok elite dan golongan saja.\n" +
                        "\n" +
                        "\"Seakan-akan negeri ini milik sendiri. Seakan-akan, semuanya harus dibaku atur oleh segelintir elit saja. Jika benar ini yang terjadi, demokrasi Indonesia yang sudah rapuh 8 tahun ini, menjadi semakin bobrok,\" ucap Herzaky.\n" +
                        "\n" +
                        "Partai Demokrat disebutkan Herzaky, akan mengawal demokrasi Indonesia, agar semakin berkembang dan matang. Pihaknya juga akan melawan jika ada upaya oligarki mengambil alih kedaulatan rakyat dan berusaha mengintervensi parpol sebagai salah satu pilar demokrasi.\n" +
                        "\n" +
                        "\"Demokrat seperti yang selalu ditegaskan oleh Ketua Umum Agus Harimurti Yudhoyono dalam berbagai kesempatan, akan terus konsisten bersama rakyat, memperjuangkan perubahan dan perbaikan,\" pungkas Herzaky Mahendra Putra.\n" +
                        "\n" +
                        "Sebagaimana diketahui, isu reshuffle bermula dari pernyataan relawan Jokowi yang menyebutkan perlu dilakukan pergantian Menteri pasca penetapan Anies Baswedan sebagai Capres dari Partai Nasdem yang merupakan partai koalisi pemerintah di era Jokowi-Ma'ruf Amin.\n" +
                        "\n" +
                        "Presiden Jokowi saat ditanyai terkait rencana reshuffle menyebutkan kemungkinan tersebut selalu ada.\n" +
                        "\n" +
                        "\"Rencana selalu ada. Pelaksanaan nanti diputuskan,\" kata Jokowi saat ditanya wartawan soal apakah ada rencana reshuffle kabinet saat meninjau Stasiun Kereta Cepat Indonesia China di Stasiun Kereta Cepat Tegalluar, Cileunyi, Kabupaten Bandung, Kamis (13/10/2022).",

                "JAKARTA - Kabar menteri-menteri dari kader Partai Nasdem akan di-reshuffle oleh Presiden Joko Widodo (Jokowi) santer terdengar, setelah Ketua DPP Nasdem Zulfan Lindan menyebut Anies Baswedan sebagai antitesis Jokowi.\n" +
                        "\n" +
                        "Menanggapi hal ini, Ketua DPP PPP Achmad Baidowi mengatakan, reshuffle kabinet itu sejatinya merupakan hak prerogatif presiden.\n" +
                        "\n" +
                        "Namun jika reshuffle ini dikaitkan dengan Nasdem, ia jadi teringat kondisi periode pertama pemerintahan Jokowi, yang mana ada menteri dari sebuah parpol yang memilih mundur dari kabinet karena berseberangan dengan pemerintah.\n" +
                        "\n" +
                        "\"Itu hak prerogatif Presiden Jokowi ya soal reshuffle, tetapi kalau memang... Begini, dulu ada parpol ketika tidak sejalan dengan pemerintahan dan memilih berseberangan, maka parpol tersebut mundur dari kabinet, itu yang periode lalu, enggak tahu kalau sekarang,\" kata pria yang akrab disapa Awiek ini saat dihubungi, Jumat (14/10/2022)." +
                        "\n" + "Diketahui, pada pertengahan 2018 lalu atau bertepatan dengan pendaftaran capres dan cawapres ke Komisi Pemilihan Umum (KPU), Menteri PAN RB yang juga kader PAN Asman Abnur, memilih mundur setelah santer kabar dirinya akan di-reshuffle lantaran PAN mengusung Prabowo-Sandi di Pilpres 2019.\n" +
                        "\n" +
                        "Terkait Nasdem yang mendapat banyak kritikan dari parpol koalisi termasuk PDIP, Awiek melihat, Nasdem tidak disudutkan melainkan NasDem yang membuat blunder dengan salah satu elitenya yang menyebut Anies antitesis Jokowi, sehingga menciptakan konfrontasinya sendiri.\n" +
                        "\n" +
                        "Kalau soal dukungan capres-cawapres masih panjang prosesnya, tapi yang jadi soal adalah pernyataan tentang antitesis kepemimpinan yang kian memperkeruh hubungan Nasdem dan PDIP.\n" +
                        "\n" +
                        "\"Kalau soal capres-cawapres itu kan masih panjang, dan belum tentu juga, calon-calon presiden itu bisa berangkat karena harus memenuhi tiket 20% kursi atau 25% suara. Namun pernyataan-pernyataan yang blunder itu membuat situasi memanas, khusunya hubungan PDIP dengan Nasdem, terkait dengan tesis antitesis, kepemimpinan antitesis itu lho,\" terangnya.\n" +
                        "\n" +
                        "Menurut Wakil Ketua Baleg DPR ini, kalau dalam konteks hubungan antar parpol, hubungan Nasdem dengan PDIP pada dasarnya tidak ada masalah, tetapi kalau konteks hubungan koalisi tentu hubungannya antara Nasdem dengan Jokowi, karena Nasdem bagian koalisi pemerintah.\n" +
                        "\n" +
                        "\"Kalau hubungan dengan sesama koalisi tentu itu kan hubungannya Nasdem dengan Jokowi, kan koalisinya di situ,\" ujarnya.\n" +
                        "\n" +
                        "Namun demikian, Awiek menyayangkan kalimat seperti itu keluar ke publik, apalagi pernyataan Anies antitesis Jokowi itu keluar dari seorang politikus, bukan pengamat politik.\n" +
                        "\n" +
                        "\"Bahasa, kalimat antitesa dari Jokowi, itu kan tidak etis sebenarnya, kalau tesa antitesa kan gampang, kalau tesanya kenyang, antitesanya lapar, kan gitu. Karena apa, Pak Zulfan itu pelaku politik, kecuali yang berstatement itu atau menganalisa, itu pengamat,\" pungkasnya",

                "JAKARTA - Wakil Ketua Majelis Syura PKS Hidayat Nur Wahid (HNW) menilai Gubernur DKI Jakarta Anies Baswedan sebagai pemimpin yang baik, karena mampu mendatangkan kemaslahatan umat.\n" +
                        "\n" +
                        "Menurut HNW, Anies berhasil menggunakan kekuasaannya dengan baik dan benar, sehingga memberikan manfaat bagi masyarakat.Salah satunya saat orang nomor satu di DKI Jakarta itu berhasil menutup Alexis pada 2018 silam.\n" +
                        "\n" +
                        "”Dalam konteks Jakarta, kita pernah mengalami suatu peristiwa di mana ketika Pak Anies dimenangkan warga Jakarta sebagai Gubernur DKI, ada kawasan masih pada ingat kali ya apa itu? Hotel Alexis,” kata Hidayat di Balai Kota DKI Jakarta, Kamis (13/10/2022). Baca juga: Anies hingga Politikus PKS Hadiri Istighosah Jawara di Balai Kota\n" +
                        "\n" +
                        "Sebelum Anies menjadi Gubernur, kata HNW, tempat hiburan malam tersebut tetap bertahan meskipun banyak desakan untuk tutup. Bahkan HNW menyebut, berbagai nasehat hingga ceramah pemuka agama pun tidak membuat Alexis tutup.\n" +
                        "\n" +
                        "”Jadi betapa banyak khotbah disampaikan, ceramah agama disampaikan, nasehat disampaikan, istigosah dilakukan dan mungkin juga demo untuk menutup Hotel Alexis nggak tutup tutup. Bahkan ada dulu yang bilang itu kang surga, surganya siapa?,” katanya.\n" +
                        "\n" +
                        "”Tetapi ketika kemudian hadirlah pemimpin yang dimenangkan oleh rakyat pak Anies Baswedan, ketika itu tidak lagi diperlukan istigosah ceramah khotbah demo, cukup beliau tidak menandatangani perpanjangan izin, maka Alexis berhenti,” sambungnya." + "\n" +
                        "Wakil Ketua MPR RI itu menyinggung pernyataan para ulama yang menyebut bahwa pemimpin baik akan membawa kebaikan untuk bangsa dan negara." + "\n" +
                        "”Salah satu gambaran dari benarnya apa yang disampaikan para ulama, bahwa pemimpin yang baik, pemimpin yang benar akan efektif menghadirkan kemaslahatan bagi umat, bagi bangsa dan negara,” ungkapnya.\n" +
                        "\n" +
                        "”Dan karena hanya pemimpin yang baik ini penting untuk kemudian selalu bisa dihadirkan didukung, dikuatkan supaya kebaikannya, akan selalu hadir dan semakin kuat semakin banyak yang menikmatinya,” tukasnya.",

                "Jakarta, CNN Indonesia -- Ketua DPP Partai NasDem Teuku Taufiqulhadi mengatakan pengurus pusat partainya telah menginstruksikan seluruh struktur partai di daerah memasang spanduk dan baliho pencalonan Anies Baswedan sebagai calon presiden.\n" +
                        "\"Benar kami diinstruksikan DPP buat spanduk atau baliho Anies sebagai capres. Itu sudah diinstruksikan,\" kata Taufiqulhadi kepada CNNIndonesia.com, Jumat (14/10).\n" +
                        "\n" +
                        "Taufiqulhadi mengklaim instruksi itu sudah dilaksanakan dengan baik oleh para pengurus daerah." + "\n" +
                        "\"Itu DPW disampaikan DPD tingkat kabupaten, dan DPD sampaikan kepada pengurus di tingkat kecamatan atau DPC,\" kata dia." + "\n" +
                        "Taufiqulhadi mengatakan instruksi itu untuk menindaklanjuti dukungan NasDem terhadap Anies. Karenanya, dukungan itu perlu disosialisasikan kepada masyarakat luas di penjuru Indonesia. Sehingga, gaung Anies sebagai capres bisa diterima oleh masyarakat.\n" +
                        "\n" +
                        "\"Maka kita harus sosialisasikan. Itu keputusan. Kita gaungkan, karena sudah diputuskan DPP. Rasanya mendapatkan antusiasme yang tinggi dari DPW dan DPD,\" kata dia.\n" +
                        "\n" +
                        "Diketahui, Anies sudah dideklarasikan oleh NasDem sebagai calon presiden untuk maju di Pilpres 2024. Pengumuman itu diumumkan langsung oleh Ketum NasDem Surya Paloh di NasDem Tower, Jakarta Pusat pada 3 Oktober 2022 lalu.\n" +
                        "\n" +
                        "NasDem tak bisa sendirian mengusung calon presiden untuk maju di Pilpres 2024. Pasalnya, NasDem hanya meraih 9,05 persen suara pada Pemilu 2019.\n" +
                        "\n" +
                        "Sementara syarat ambang batas pencalonan presiden yaitu memiliki 25 persen suara sah nasional atau 20 persen kursi di DPR. NasDem harus mencari rekan koalisi parpol lain untuk mengusung Anies.",

                "MESKIPUN pemilihan umum (pemilu) termasuk pemilihan presiden dan wakil presiden baru akan dihelat 16 bulan lagi, namun tensi dan suhu politik mulai memanas. Narasi-narasi memecah belah dengan diksi intoleran, antikeberagaman, bahkan radikalisme kembali dimunculkan. Ruang publik kini mulai dipenuhi oleh umpatan, hujatan dan narasi adu domba.\n" +
                        "\n" +
                        "Belajar dari dua perhelatan pemilu sebelumnya, sejatinya masyarakat sudah harus dan wajib paham bahwa narasi-narasi yang patut diduga dilakukan oleh kelompok-kelompok tertentu itu adalah lagu lama yang diputar kembali. Dari pengalaman sebelumnya pula, masyarakat perlu sadar bahwa jargon-jargon intoleran, dan antikeberagaman sejatinya hanyalah alat politik pihak-pihak tertentu." + "\n"
                        + "Tensi dan suhu politik bisa jadi akan semakin tinggi di awal tahun depan, mengingat partai politik diperkirakan akan menentukan siapa calon yang akan diusung untuk menjadi capres dan cawapres untuk lima tahun kedepannya.\n" +
                        "\n" +
                        "Perlu kesadaran dari masyarakat, termasuk para elite politik untuk memberikan edukasi politik yang masif kepada masyarakat dan para kontestan politik, agar tidak terprovokasi oleh kepentingan-kepentingan politik yang tidak bermanfaat.\n" +
                        "\n" +
                        "Penting juga untuk melakukan peningkatan literasi politik di kalangan masyarakat dalam menyambut pemilihan umum 2024.\n" +
                        "\n" +
                        "Tahun 2023 dipastikan akan mulai riuh dengan kontestasi, persaingan, dan manuver dari berbagai partai politik serta elite politik untuk menaikkan citra dari masing-masing partai dan meraup dukungan masyarakat.\n" +
                        "\n" +
                        "Sehingga berpotensi diwarnai oleh berbagai isu politik, seperti isu korupsi, isu politik uang, dan berbagai isu lainnya termasuk isu SARA dengan kontra propaganda yang berpotensi mencederai kehidupan berdemokrasi di Indonesia.\n" +
                        "\n" +
                        "Karenanya, penting untuk melakukan peningkatan literasi politik bagi masyarakat untuk mengantisipasi berbagai isu yang akan mencuat di media sosial maupun media massa.\n" +
                        "\n" +
                        "Terlebih karakteristik nilai-nilai demokrasi yang bersifat dinamis dan berubah-ubah, sesuai dengan perkembangan zaman sehingga memang perlu untuk terus menyampaikan nilai-nilai demokrasi yang bermartabat dari generasi ke generasi.\n" + "\n" +
                        "Pendidikan politik kepada masyarakat dapat menciptakan kehidupan demokrasi yang sehat dan mewujudkan masyarakat Indonesia yang cerdas dan dewasa dalam berpolitik.\n" +
                        "\n" +
                        "Pemilih rasional yang cerdas dan kritis secara sederhana dapat digambarkan sebagai pemilih yang bukan saja memiliki pengetahuan dan kesadaran elektoral melainkan juga bebas dari berbagai bentuk intimidasi.\n" +
                        "\n" +
                        "Memiliki daya tahan terhadap serangan atau bujukan transaksional yang tidak sehat dan melanggar aturan seperti politik uang. Serta memahami betul arti penting suara yang mereka miliki dan konsekuensi politik dari pilihannya di kemudian hari.\n" +
                        "\n" +
                        "Untuk meningkatkan kecerdasan dan daya kritis para pemilih pemula, berbagai pihak khususnya KPU dan Bawaslu sebagai penyelenggara pemilu, pemerintah maupun peserta pemilu (khususnya partai politik) perlu memperkuat upaya pendidikan pemilih terutama melalui kegiatan-kegiatan sosialisasi.\n" +
                        "\n" +
                        "Senab, selama ini, edukasi yang diberika beljm memberikan dampak yang berarti untuk menumbuhkan kecerdasan dan daya kritis pemilih pemula. Secara umum sosialisasi pemilu hanya berhasil meningkatkan pengetahuan dan kesadaran teknis elektoral seperti kapan, dimana dan bagaimana cara memberikan suara pada hari dan tanggal pemungutan suara dilakukan.\n" +
                        "\n" +
                        "Sementara aspek-aspek substantif elektoral seperti arti penting setiap suara yang diberikan, pentingnya membangun otonomi dan kemandirian politik, dampak buruk dari praktik-praktik transaksi politik yang tidak sehat seperti money politics, dan dampak atau konsekuensi pilihan politik di kemudian hari, cenderung terabaikan dan gagal ditumbuhkan secara masif sebagai bentuk kesadaran substantif di kalangan pemilih pemula.\n" +
                        "\n" +
                        "Memilih calon anggota legislatif hingga capres dan cawapres perlu dilakukan dengan rasional, tidak emosional dan sektarian. Hal itu penting agar pemimpin yang terpilih mampu membawa bangsa ke arah yang lebih baik bagi kesejahteraan dan kemakmuran rakyat.",

                "Jakarta, CNN Indonesia -- Komisi Pemilihan Umum (KPU) menyatakan 18 partai politik (parpol) memenuhi syarat verifikasi administrasi Pemilu 2024. Keputusan itu tertuang dalam surat pengumuman nomor 9/PL.01.1-Pu/05/2022. Salinan surat itu telah dipublikasi di situs resmi KPU.\n" +
                        "Berdasarkan surat tersebut, partai-parti yang lolos adalah Partai Demokrasi Indonesia Perjuangan (PDIP), Partai Keadilan Sejahtera (PKS), Partai Perindo, Partai NasDem, Partai Bulan Bintang (PBB), dan Partai Kebangkitan Nusantara (PKN).\n" +
                        "\n" +
                        "Selanjutnya ada Partai Garda Perubahan Indonesia, Partai Demokrat, Partai Gelombang Rakyat Indonesia (Gelora), Partai Hati Nurani Rakyat (Hanura), Partai Gerakan Indonesia Raya (Gerindra), Partai Kebangkitan Bangsa (PKB), dan Partai Solidaritas Indonesia (PSI)." + "\n" +
                        "Ada pula Partai Amanat Nasional (PAN), Partai Golkar, Partai Persatuan Pembangunan (PPP), Partai Buruh, dan Partai Ummat." + "\n" +
                        "Dengan demikian, ada enam parpol yang tak lolos verifikasi administrasi. Mereka adalah Partai Swara Rakyat Indonesia, Partai Republik, Partai Republik Satu, Partai Republik Indonesia, Partai Rakyat Adil Makmur (Prima), dan Partai Keadilan dan Persatuan.\n" +
                        "\n" +
                        "\"Ya mas (enam parpol tidak lolos verifikasi administrasi). Kita lanjut untuk verifikasi faktual parpol yang memenuhi syarat untuk verifikasi administrasi perbaikan,\" ujar Komisioner KPU Betty Idroos kepada CNNIndonesia.com, Jumat (14/10).\n" +
                        "\n" +
                        "KPU akan melakukan verifikasi faktual dengan mengecek kepengurusan parpol di 100 persen provinsi, 75 persen kabupaten/kot, dan 50 persen kecamatan yang ada di Indonesia."
        };

        String arrUsia17[]={
                "SU", "SU", "SU", "SU", "SU", "13+", "17+"
        };

        String arrTgl17[]={
                "Jumat, 14 Okt 2022 14:25 WIB",
                "Jumat, 14 Okt 2022 11:59 WIB",
                "Jumat, 14 Okt 2022 09:04 WIB",
                "Jumat, 14 Okt 2022 08:14 WIB",
                "Jumat, 14 Okt 2022 11:22 WIB",
                "Kamis, 13 Okt 2022 23:25 WIB",
                "Jumat, 14 Okt 2022 14:14 WIB"
        };

        int arrImage17[]={
                R.drawable.p1, R.drawable.p2, R.drawable.p3, R.drawable.p4, R.drawable.p5, R.drawable.p6, R.drawable.p7
        };

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        if (usia < 13){
            recyclerView.setAdapter(new PoliticsAdapter(this, arrJudul13, arrKategori13, arrKonten13, arrTgl13, arrUsia13, arrImage13));
        }
        else if (usia < 17 && usia >= 13 ) {
            recyclerView.setAdapter(new PoliticsAdapter(this, arrJudul, arrKategori, arrKonten, arrTgl, arrUsia, arrImage));
        }
        else {
            recyclerView.setAdapter(new PoliticsAdapter(this, arrJudul17, arrKategori17, arrKonten17, arrTgl17, arrUsia17, arrImage17));
        }
    }
}
