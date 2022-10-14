package com.example.uts_papbb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class SportActivity extends AppCompatActivity {

    public static final String EXTRA_USIA = "extra_usia";

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        int usia = getIntent().getIntExtra(EXTRA_USIA, 0);

//        Toast toast = Toast.makeText(getApplicationContext(), Integer.toString(usia), Toast.LENGTH_SHORT);
//        toast.show();

        recyclerView = findViewById(R.id.rv_sport);

        String arrJudul13[]={"Odegaard Berkembang Setelah Jadi Kapten Arsenal?",

                "Bagnaia: Quartararo Harus Dikalahkan!",

                "Target Juara IBL 2023, Dewa United Rekrut 2 Pebasket Amerika",

                "Hasil F1 GP Belgia 2022: Verstappen Menang, Hamilton Kecelakaan",

                "Liga Europa, MU Susah Payah Kalahkan Omonia Nicosia 1-0"
        };

        String arrKategori13[]={
                "Sepak Bola",
                "Balapan",
                "Basket",
                "Balapan",
                "Sepak Bola"
        };

        String arrKonten13[]={
                "Jakarta - Martin Odegaard telah menjadi sosok utama di Arsenal. Lantas, apakah peningkatan Odegaard tak lepas karena diberi kepercayaan sebagai kapten tim?\n" +
                        "Odegaard gagal menembus tim utama real Madrid. Arsenal kemudian datang menyambut gelandang asal Norwegia itu.\n" +
                        "\n" +
                        "Di bawah arahan Mikel Arteta, Odegaard menjelma menjadi andalan di lini tengah. Tak main-main, Arteta juga memberi kepercayaan kepada Odegaard sebagai kapten tim meski baru berusia 23 tahun.\n" +
                        "\n" +
                        "Baca artikel sepakbola, \"Odegaard Berkembang Setelah Jadi Kapten Arsenal?\"" +
                        "\n" +
                        "Sebagai pemain yang terbilang masih muda dan harus menjadi pemimpin Arsenal di atas lapangan, Odegaard berhasil. Dia juga dianggap sebagai pemain yang sangat dewasa.\n" +
                        "\n" + "\"Sejujurnya saya tidak terlalu memikirkannya (perubahan karier). Saya mencoba melakukan hal yang sama, membantu tim sekuat mungkin. Saya menikmati tanggung jawab (kapten) dan hanya berusaha melakukan yang terbaik untuk tim dan semoga baik,\" kata Odegaard seperti dikutip dari situs resmi Arsenal.\n" +
                        "\n" +"Setelah sempat dipinjamkan ke banyak klub oleh Real Madrid, Odegaard merasa dengan menjadi pemain permainan di Arsenal adalah yang terbaik dalam kariernya. Dia juga sejauh ini membantu Meriam London untuk terus bercokol di puncak klasemen.\n" +
                        "\n" +
                        "\"Saya pikir berkembang banyak dalam beberapa tahun terakhir. Saya selalu bagus saat menguasai bola, tetapi saya merasa seperti mengembangkan sisi berbeda dari permainan, yaitu tanpa bola,\" Odegaard menjelaskan.\n" +
                        "\n" +
                        "\"Bagaimana meningkatkan dan mempengaruhi permainan dengan cara yang berbeda, jadi ya saya merasa seperti baik-baik saja dan tentu saja ketika tim melakukannya dengan baik itu membuat segalanya lebih mudah bagi saya juga,\" tegasnya.\n"
                ,

                "Phillip Island - Francesco Bagnaia masih berpeluang besar meraih gelar juara MotoGP 2022. Rider Ducati itu berhasrat menaklukkan Fabio Quartararo hingga akhir musim.\n" + "\n" +
                        "Persaingan juara MotoGP musim ini tinggal menyisakan tiga race lagi. Quartararo dan Bagnaia bersaing ketat di papan klasemen sementara.\n" +
                        "\n" +
                        "Quartararo masih memuncaki klasemen MotoGP 2022 dengan 219 poin. Bagnaia tepat di belakangnya dengan margin dua angka saja.\n" + "\n" + "\"Fabio jelas adalah orang yang harus dikalahkan. Dia adalah salah satu pebalap terkuat dan juara dunia tahun lalu,\" kata Bagnaia jelang MotoGP Australia, dikutip dari Crash.\n" +
                        "\n" +
                        "\"Namun saya dalam situasi yang lebih baik daripada Fabio. Saya merasa hebat dengan motor saya, saya bisa mendorong, saya bisa menyerang,\" dia menambahkan.\n" +
                        "\n" + "\"Dia lebih berjuang dengan motornya. Memang benar motor kami lebih lengkap,\" Francesco Bagnaia mengungkapkan.\n" +
                        "\n" +
                        "3 Race Pamungkas MotoGP 2022\n" +
                        "MotoGP Australia: 16 Oktober\n" +
                        "MotoGP Malaysia: 23 Oktober\n" +
                        "MotoGP Valencia: 6 November.\n",

                "Jakarta - Dewa United Surabaya merekrut dua pebasket asal Amerika Serikat demi memenuhi target juara Indonesia Basketball League (IBL) musim 2023.\n" +
                        "Dua pemain asing itu ialah Anthony Jonson dan Ramon Galloway. Keduanya dipilih pada IBL Draft, Selasa (11/10/2022) untuk menjadi bagian dari Dewa United.\n" +
                        "\n" +
                        "Anthony merupakan pemain yang bisa bermain di posisi forward dan center. Sedangkan Ramon dapat dimanfaatkan tim guna mengisi posisi guard.\n" +
                        "\n" + "CEO Dewa United Surabaya Michael Oliver Wellerz menyambut positif kehadiran dua rekrutan barunya tersebut. Ia pun berharap keduanya dapat memberikan kontribusi signifikan bagi prestasi tim.\n" +
                        "\n" +
                        "\"Harapannya tentu semoga kedua pemain ini bisa memberikan kontribusi bagi Dewa United Surabaya untuk merealisasikan target juara musim depan,\" kata Michael dalam keterangan resminya, Rabu (12/10/2022).\n" +
                        "\n" + "Sebelum menjadi bagian Dewa United Surabaya, Anthony Johnson terakhir kali bermain di Liga Basket Venezuela memperkuat Taurinos de Aragua. Sedangkan Ramon Galloway bermain untuk San Lazaro Club di Liga Basket Dominika.\n" +
                        "\n" +
                        "Mengenai kehadiran dua pemain asing baru ini, pelatih Dewa United Surabaya Maximiliano Enrique Seigorman mengatakan keduanya sesuai dengan kebutuhan tim. Di mana Dewa United Surabaya membutuhkan peran pemain di posisi guard dan big man.\n" +
                        "\n" +
                        "\"Kedua pemain asing baru ini memang sesuai dengan kebutuhan tim. Kami memang menginginkan adanya sosok yang bisa diandalkan di posisi tersebut,\" kata Maxi.\n" +
                        "\n" +
                        "Tim Dewa United sendiri sudah memulai persiapan IBL 2023 sejak 6 Oktober lalu. Persiapan lebih awal dilakukan Dewa United demi mendapat modal bagus menatap target juara musim depan.\n",

                "Jakarta, CNN Indonesia -- Pembalap Red Bull Max Verstappen menang Formula 1 (F1) Grand Prix (GP) Belgia 2022 di Sirkuit de Spa-Francorchamps, Minggu (28/8).\n" +
                        "Start apik dilakukan pembalap Red Bull Max Verstappen yang langsung memimpi balapan setelah memulai dari posisi ke-14.\n" +
                        "\n" +
                        "Drama langsung terjadi pada awal-awal balapan. Pada lap pertama Lewis Hamilton dari Mercedes melakukan kontak dengan Fernando Alonso dari Alpine Renault, sedangkan pembalap Alfa Romeo Valtteri Bottas bersenggolan dengan Nicholas Latifi dari Williams.\n" +
                        "\n" + "Kecelakaan itu membuat Hamilton dan Bottas tidak bisa melanjutkan balapan di F1 GP Belgia 2022.\n" +
                        "\n" +
                        "Pada lap 35 Verstappen masih di posisi terdepan, disusul rekan satu timnya Sergio Perez dan Carlos Sainz dari Ferrari.\n" +
                        "\n" +
                        "Saat balapan tersisa tiga lap, Verstappen memiliki jarak 17,5 detik atas Perez sebagai pesaing terdekat.\n" +
                        "\n" +
                        "Persaingan sengit terjadi pada Alonso dan Leclerc pada lap-lap terakhir. Pada lap 43, Charles Leclerc menyalip Fernando Alonso guna meraih posisi kelima.\n" +
                        "\n" +
                        "Verstappen akhirnya mengunci kemenangan dengan keunggulan +17,841 detik atas Sergio Perez, disusul Carlos Sainz pada posisi tiga besar.\n" +
                        "\n" +
                        "Kemenangan di F1 GP Belgia 2022 membuat Verstappen menang dalam tiga seri beruntun untuk kedua kalinya pada musim ini (F1 GP Prancis, Hungaria, dan Belgia).\n" +
                        "\n" +
                        "Sebelumnya pembalap asal Belanda itu juga menang dalam tiga seri beruntun di Emilia Romagna, GP Amerika Serikat, dan GP Spanyol.\n" +
                        "\n" +
                        "Hasil positif di F1 GP Belgia mengukuhkan posisi Verstappen pada klasemen F1 2022 dengan 283 poin.\n",

                "Jakarta, CNN Indonesia -- Manchester United akhirnya mengalahkan Omonia Nicosia dengan skor 1-0 dalam laga matchday 4 fase grup Liga Europa 2022/2023, Jumat (14/10) dini hari.\n" +
                        "Selama pertandingan di Old Trafford, Manchester United mendominasi permainan. Sedikitnya 34 tendangan diarahkan ke gawang lawan. Namun hanya satu gol yang tercipta dari tembakan Scott McTominay di masa injury time babak kedua.\n" +
                        "\n" + "Pada awal babak pertama, Manchester United tampak agresif. Beberapa peluang didapat tim Setan Merah, namun usaha mencetak gol masih bisa digagalkan Francis Uzoho.\n" +
                        "\n" +
                        "Marcus Rashford berusaha menembus pertahanan Omonia. Tapi Uzoho mampu menjadi benteng kokoh bagi timnya. Dua peluang emas Rashford digagalkan oleh kiper asal Nigeria itu.\n" +
                        "\n" + "Beberapa peluang kembali didapat skuad Manchester United, mulai dari tembakan Casemiro yang mengenai mistar, hingga aksi Fred yang belum mengenai sasaran.\n" +
                        "\n" +
                        "Pluit akhir babak pertama ditiup. Tak ada gol yang tercipta dari kedua tim.\n" +
                        "\n" +
                        "Pada babak kedua, Uzoho semakin sigap melakukan serangkaian penyelamatan. Para pemain Manchester United mulai dibuat frustrasi. Mereka gagal membobol gawang Uzoho.\n" +
                        "\n" + "Erik ten Hag bereaksi kemudian memasukkan Jadon Sancho, Luke Shaw, hingga Christian Eriksen. Manchester United melakukan serangan bertubi-tubi, namun mereka belum juga berhasil mengubah skor.\n" +
                        "\n" +
                        "Setelah diserang habis-habisan oleh Manchester United, gawang Uzoho akhirnya jebol juga. Pada masa injury time, kemelut di kotak penalti berhasil dimanfaatkan McTominay. Uzoho kini gagal mengantisipasi gol.\n" +
                        "\n" +
                        "Manchester United akhirnya mengantongi kemenangan hingga akhir pertandingan.\n" +
                        "\n" +
                        "Dengan perolehan skor ini, Manchester United masih tertahan di peringkat dua klasemen Grup E dengan poin 9. Sementara itu, Omonia tetap terpuruk di peringkat empat tanpa meraih poin sama sekali.\n" +
                        "\n"
        };

        String arrUsia13[]={
                "SU", "SU", "SU", "SU", "SU"
        };

        String arrTgl13[]={
                "Kamis, 13 Okt 2022 21:00 WIB", "Selasa, 11 Okt 2022 22:20 WIB", "Rabu, 12 Okt 2022 13:35 WIB", "Minggu, 28 Agu 2022 21:41", "Jumat, 14 Okt 2022 05:34 WIB"
        };

        int arrImage13[]={
                R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img6, R.drawable.img7
        };

        String arrJudul[]={"Odegaard Berkembang Setelah Jadi Kapten Arsenal?",

                "Bagnaia: Quartararo Harus Dikalahkan!",

                "Target Juara IBL 2023, Dewa United Rekrut 2 Pebasket Amerika",

                "Hasil F1 GP Belgia 2022: Verstappen Menang, Hamilton Kecelakaan",

                "Liga Europa, MU Susah Payah Kalahkan Omonia Nicosia 1-0",

                "Ketua PBSI: Konflik Kevin dan Herry IP Sudah Selesai"
        };

        String arrKategori[]={
                "Sepak Bola",
                "Balapan",
                "Basket",
                "Balapan",
                "Sepak Bola",
                "Bulutangkis"
        };

        String arrKonten[]={
                "Jakarta - Martin Odegaard telah menjadi sosok utama di Arsenal. Lantas, apakah peningkatan Odegaard tak lepas karena diberi kepercayaan sebagai kapten tim?\n" +
                        "Odegaard gagal menembus tim utama real Madrid. Arsenal kemudian datang menyambut gelandang asal Norwegia itu.\n" +
                        "\n" +
                        "Di bawah arahan Mikel Arteta, Odegaard menjelma menjadi andalan di lini tengah. Tak main-main, Arteta juga memberi kepercayaan kepada Odegaard sebagai kapten tim meski baru berusia 23 tahun.\n" +
                        "\n" +
                        "Baca artikel sepakbola, \"Odegaard Berkembang Setelah Jadi Kapten Arsenal?\"" +
                        "\n" +
                        "Sebagai pemain yang terbilang masih muda dan harus menjadi pemimpin Arsenal di atas lapangan, Odegaard berhasil. Dia juga dianggap sebagai pemain yang sangat dewasa.\n" +
                        "\n" + "\"Sejujurnya saya tidak terlalu memikirkannya (perubahan karier). Saya mencoba melakukan hal yang sama, membantu tim sekuat mungkin. Saya menikmati tanggung jawab (kapten) dan hanya berusaha melakukan yang terbaik untuk tim dan semoga baik,\" kata Odegaard seperti dikutip dari situs resmi Arsenal.\n" +
                        "\n" +"Setelah sempat dipinjamkan ke banyak klub oleh Real Madrid, Odegaard merasa dengan menjadi pemain permainan di Arsenal adalah yang terbaik dalam kariernya. Dia juga sejauh ini membantu Meriam London untuk terus bercokol di puncak klasemen.\n" +
                        "\n" +
                        "\"Saya pikir berkembang banyak dalam beberapa tahun terakhir. Saya selalu bagus saat menguasai bola, tetapi saya merasa seperti mengembangkan sisi berbeda dari permainan, yaitu tanpa bola,\" Odegaard menjelaskan.\n" +
                        "\n" +
                        "\"Bagaimana meningkatkan dan mempengaruhi permainan dengan cara yang berbeda, jadi ya saya merasa seperti baik-baik saja dan tentu saja ketika tim melakukannya dengan baik itu membuat segalanya lebih mudah bagi saya juga,\" tegasnya.\n"
                        ,

                "Phillip Island - Francesco Bagnaia masih berpeluang besar meraih gelar juara MotoGP 2022. Rider Ducati itu berhasrat menaklukkan Fabio Quartararo hingga akhir musim.\n" + "\n" +
                        "Persaingan juara MotoGP musim ini tinggal menyisakan tiga race lagi. Quartararo dan Bagnaia bersaing ketat di papan klasemen sementara.\n" +
                        "\n" +
                        "Quartararo masih memuncaki klasemen MotoGP 2022 dengan 219 poin. Bagnaia tepat di belakangnya dengan margin dua angka saja.\n" + "\n" + "\"Fabio jelas adalah orang yang harus dikalahkan. Dia adalah salah satu pebalap terkuat dan juara dunia tahun lalu,\" kata Bagnaia jelang MotoGP Australia, dikutip dari Crash.\n" +
                        "\n" +
                        "\"Namun saya dalam situasi yang lebih baik daripada Fabio. Saya merasa hebat dengan motor saya, saya bisa mendorong, saya bisa menyerang,\" dia menambahkan.\n" +
                        "\n" + "\"Dia lebih berjuang dengan motornya. Memang benar motor kami lebih lengkap,\" Francesco Bagnaia mengungkapkan.\n" +
                        "\n" +
                        "3 Race Pamungkas MotoGP 2022\n" +
                        "MotoGP Australia: 16 Oktober\n" +
                        "MotoGP Malaysia: 23 Oktober\n" +
                        "MotoGP Valencia: 6 November.\n",

                "Jakarta - Dewa United Surabaya merekrut dua pebasket asal Amerika Serikat demi memenuhi target juara Indonesia Basketball League (IBL) musim 2023.\n" +
                    "Dua pemain asing itu ialah Anthony Jonson dan Ramon Galloway. Keduanya dipilih pada IBL Draft, Selasa (11/10/2022) untuk menjadi bagian dari Dewa United.\n" +
                    "\n" +
                    "Anthony merupakan pemain yang bisa bermain di posisi forward dan center. Sedangkan Ramon dapat dimanfaatkan tim guna mengisi posisi guard.\n" +
                    "\n" + "CEO Dewa United Surabaya Michael Oliver Wellerz menyambut positif kehadiran dua rekrutan barunya tersebut. Ia pun berharap keduanya dapat memberikan kontribusi signifikan bagi prestasi tim.\n" +
                    "\n" +
                    "\"Harapannya tentu semoga kedua pemain ini bisa memberikan kontribusi bagi Dewa United Surabaya untuk merealisasikan target juara musim depan,\" kata Michael dalam keterangan resminya, Rabu (12/10/2022).\n" +
                    "\n" + "Sebelum menjadi bagian Dewa United Surabaya, Anthony Johnson terakhir kali bermain di Liga Basket Venezuela memperkuat Taurinos de Aragua. Sedangkan Ramon Galloway bermain untuk San Lazaro Club di Liga Basket Dominika.\n" +
                    "\n" +
                    "Mengenai kehadiran dua pemain asing baru ini, pelatih Dewa United Surabaya Maximiliano Enrique Seigorman mengatakan keduanya sesuai dengan kebutuhan tim. Di mana Dewa United Surabaya membutuhkan peran pemain di posisi guard dan big man.\n" +
                    "\n" +
                    "\"Kedua pemain asing baru ini memang sesuai dengan kebutuhan tim. Kami memang menginginkan adanya sosok yang bisa diandalkan di posisi tersebut,\" kata Maxi.\n" +
                    "\n" +
                    "Tim Dewa United sendiri sudah memulai persiapan IBL 2023 sejak 6 Oktober lalu. Persiapan lebih awal dilakukan Dewa United demi mendapat modal bagus menatap target juara musim depan.\n",

                "Jakarta, CNN Indonesia -- Pembalap Red Bull Max Verstappen menang Formula 1 (F1) Grand Prix (GP) Belgia 2022 di Sirkuit de Spa-Francorchamps, Minggu (28/8).\n" +
                        "Start apik dilakukan pembalap Red Bull Max Verstappen yang langsung memimpi balapan setelah memulai dari posisi ke-14.\n" +
                        "\n" +
                        "Drama langsung terjadi pada awal-awal balapan. Pada lap pertama Lewis Hamilton dari Mercedes melakukan kontak dengan Fernando Alonso dari Alpine Renault, sedangkan pembalap Alfa Romeo Valtteri Bottas bersenggolan dengan Nicholas Latifi dari Williams.\n" +
                        "\n" + "Kecelakaan itu membuat Hamilton dan Bottas tidak bisa melanjutkan balapan di F1 GP Belgia 2022.\n" +
                        "\n" +
                        "Pada lap 35 Verstappen masih di posisi terdepan, disusul rekan satu timnya Sergio Perez dan Carlos Sainz dari Ferrari.\n" +
                        "\n" +
                        "Saat balapan tersisa tiga lap, Verstappen memiliki jarak 17,5 detik atas Perez sebagai pesaing terdekat.\n" +
                        "\n" +
                        "Persaingan sengit terjadi pada Alonso dan Leclerc pada lap-lap terakhir. Pada lap 43, Charles Leclerc menyalip Fernando Alonso guna meraih posisi kelima.\n" +
                        "\n" +
                        "Verstappen akhirnya mengunci kemenangan dengan keunggulan +17,841 detik atas Sergio Perez, disusul Carlos Sainz pada posisi tiga besar.\n" +
                        "\n" +
                        "Kemenangan di F1 GP Belgia 2022 membuat Verstappen menang dalam tiga seri beruntun untuk kedua kalinya pada musim ini (F1 GP Prancis, Hungaria, dan Belgia).\n" +
                        "\n" +
                        "Sebelumnya pembalap asal Belanda itu juga menang dalam tiga seri beruntun di Emilia Romagna, GP Amerika Serikat, dan GP Spanyol.\n" +
                        "\n" +
                        "Hasil positif di F1 GP Belgia mengukuhkan posisi Verstappen pada klasemen F1 2022 dengan 283 poin.\n",

                "Jakarta, CNN Indonesia -- Manchester United akhirnya mengalahkan Omonia Nicosia dengan skor 1-0 dalam laga matchday 4 fase grup Liga Europa 2022/2023, Jumat (14/10) dini hari.\n" +
                        "Selama pertandingan di Old Trafford, Manchester United mendominasi permainan. Sedikitnya 34 tendangan diarahkan ke gawang lawan. Namun hanya satu gol yang tercipta dari tembakan Scott McTominay di masa injury time babak kedua.\n" +
                        "\n" + "Pada awal babak pertama, Manchester United tampak agresif. Beberapa peluang didapat tim Setan Merah, namun usaha mencetak gol masih bisa digagalkan Francis Uzoho.\n" +
                        "\n" +
                        "Marcus Rashford berusaha menembus pertahanan Omonia. Tapi Uzoho mampu menjadi benteng kokoh bagi timnya. Dua peluang emas Rashford digagalkan oleh kiper asal Nigeria itu.\n" +
                        "\n" + "Beberapa peluang kembali didapat skuad Manchester United, mulai dari tembakan Casemiro yang mengenai mistar, hingga aksi Fred yang belum mengenai sasaran.\n" +
                        "\n" +
                        "Pluit akhir babak pertama ditiup. Tak ada gol yang tercipta dari kedua tim.\n" +
                        "\n" +
                        "Pada babak kedua, Uzoho semakin sigap melakukan serangkaian penyelamatan. Para pemain Manchester United mulai dibuat frustrasi. Mereka gagal membobol gawang Uzoho.\n" +
                        "\n" + "Erik ten Hag bereaksi kemudian memasukkan Jadon Sancho, Luke Shaw, hingga Christian Eriksen. Manchester United melakukan serangan bertubi-tubi, namun mereka belum juga berhasil mengubah skor.\n" +
                        "\n" +
                        "Setelah diserang habis-habisan oleh Manchester United, gawang Uzoho akhirnya jebol juga. Pada masa injury time, kemelut di kotak penalti berhasil dimanfaatkan McTominay. Uzoho kini gagal mengantisipasi gol.\n" +
                        "\n" +
                        "Manchester United akhirnya mengantongi kemenangan hingga akhir pertandingan.\n" +
                        "\n" +
                        "Dengan perolehan skor ini, Manchester United masih tertahan di peringkat dua klasemen Grup E dengan poin 9. Sementara itu, Omonia tetap terpuruk di peringkat empat tanpa meraih poin sama sekali.\n" +
                        "\n",

                "Jakarta, CNN Indonesia -- Ketua Umum PBSI Agung Firman Sampurna menekankan tidak ada lagi konflik antara Kevin Sanjaya Sukamuljo dengan Herry Iman Pierngadi.\n" +
                        "Agung menyatakan hal tersebut dalam acara Konferensi Pers Pernyataan PBSI Tentang Permasalahan di Sektor Ganda Putra yang berlangsung secara virtual pada Jumat (30/9) siang.\n" +
                        "\n" +
                        "\"Kami tegaskan konflik tidak ada lagi, saya bisa memahami teman-teman atlet masih muda dan saya pernah muda juga. Gesekan itu terkadang terluap ke publik, terkait masalah kepelatihan kami cari cara. Lanjut terus bisa, suasana baru juga bisa. Intinya masalah di antara kedua pihak itu tidak ada lagi,\" kata Agung dalam sesi tanya jawab.\n" +
                        "\n" + "Agung kembali menegaskan jika Kevin dan Herry tidak lagi berada pada dua kubu berseberangan dan siap menatap Olimpiade 2024.\n" +
                        "\n" +
                        "\"Saya pikir kalau orang sedang marah wajar saja bisa keluar macam-macam. Itu lumrah saja, tapi saya pikir orang menyampaikan narasi harus menyikapi sedang bijak. Teman-teman mau ini dilanjutkan enggak? Kalau perlu dilanjutkan bisa. Kalau perlu dibuatkan ring,\" ucap Agung menjelaskan soal kata-kata yang pernah keluar dari mulut Kevin dan Herry IP.\n" +
                        "\n" + "\"Tapi jujur saya tekankan masalah sudah selesai, kalau kita punya komitmen yang sama ketika ada masalah kecil itu bisa diselesaikan. Yang kita harus tatap adalah Olimpiade 2024 yang perlu persiapan sejak dini. Kami butuh atlet berbakat di Olimpiade dan butuh pelatih berpengalaman agar atlet tampil dalam kondisi terbaiknya. Soal apa yang disampaikan bisa macam-macam. Saya katakan masalah itu sudah selesai,\" sambungnya.\n" +
                        "\n"
        };

        String arrUsia[]={
                "SU", "SU", "SU", "SU", "SU", "13+"
        };

        String arrTgl[]={
            "Kamis, 13 Okt 2022 21:00 WIB", "Selasa, 11 Okt 2022 22:20 WIB", "Rabu, 12 Okt 2022 13:35 WIB", "Minggu, 28 Agu 2022 21:41", "Jumat, 14 Okt 2022 05:34 WIB", "Jumat, 30 Sep 2022 14:44 WIB"
        };

        int arrImage[]={
                R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4, R.drawable.img6, R.drawable.img7
        };

        String arrJudul17[]={"Odegaard Berkembang Setelah Jadi Kapten Arsenal?",

                "Bagnaia: Quartararo Harus Dikalahkan!",

                "Target Juara IBL 2023, Dewa United Rekrut 2 Pebasket Amerika",

                "Hasil F1 GP Belgia 2022: Verstappen Menang, Hamilton Kecelakaan",

                "Liga Europa, MU Susah Payah Kalahkan Omonia Nicosia 1-0",

                "Ketua PBSI: Konflik Kevin dan Herry IP Sudah Selesai",

                "Skenario Barcelona Turun Kasta ke Liga Europa"};

        String arrKategori17[]={
                "Sepak Bola",
                "Balapan",
                "Basket",
                "Balapan",
                "Sepak Bola",
                "Bulutangkis",
                "Sepak Bola"
        };

        String arrKonten17[]={
                "Jakarta - Martin Odegaard telah menjadi sosok utama di Arsenal. Lantas, apakah peningkatan Odegaard tak lepas karena diberi kepercayaan sebagai kapten tim?\n" +
                        "Odegaard gagal menembus tim utama real Madrid. Arsenal kemudian datang menyambut gelandang asal Norwegia itu.\n" +
                        "\n" +
                        "Di bawah arahan Mikel Arteta, Odegaard menjelma menjadi andalan di lini tengah. Tak main-main, Arteta juga memberi kepercayaan kepada Odegaard sebagai kapten tim meski baru berusia 23 tahun.\n" +
                        "\n" +
                        "Baca artikel sepakbola, \"Odegaard Berkembang Setelah Jadi Kapten Arsenal?\"" +
                        "\n" +
                        "Sebagai pemain yang terbilang masih muda dan harus menjadi pemimpin Arsenal di atas lapangan, Odegaard berhasil. Dia juga dianggap sebagai pemain yang sangat dewasa.\n" +
                        "\n" + "\"Sejujurnya saya tidak terlalu memikirkannya (perubahan karier). Saya mencoba melakukan hal yang sama, membantu tim sekuat mungkin. Saya menikmati tanggung jawab (kapten) dan hanya berusaha melakukan yang terbaik untuk tim dan semoga baik,\" kata Odegaard seperti dikutip dari situs resmi Arsenal.\n" +
                        "\n" +"Setelah sempat dipinjamkan ke banyak klub oleh Real Madrid, Odegaard merasa dengan menjadi pemain permainan di Arsenal adalah yang terbaik dalam kariernya. Dia juga sejauh ini membantu Meriam London untuk terus bercokol di puncak klasemen.\n" +
                        "\n" +
                        "\"Saya pikir berkembang banyak dalam beberapa tahun terakhir. Saya selalu bagus saat menguasai bola, tetapi saya merasa seperti mengembangkan sisi berbeda dari permainan, yaitu tanpa bola,\" Odegaard menjelaskan.\n" +
                        "\n" +
                        "\"Bagaimana meningkatkan dan mempengaruhi permainan dengan cara yang berbeda, jadi ya saya merasa seperti baik-baik saja dan tentu saja ketika tim melakukannya dengan baik itu membuat segalanya lebih mudah bagi saya juga,\" tegasnya.\n"
                ,

                "Phillip Island - Francesco Bagnaia masih berpeluang besar meraih gelar juara MotoGP 2022. Rider Ducati itu berhasrat menaklukkan Fabio Quartararo hingga akhir musim.\n" + "\n" +
                        "Persaingan juara MotoGP musim ini tinggal menyisakan tiga race lagi. Quartararo dan Bagnaia bersaing ketat di papan klasemen sementara.\n" +
                        "\n" +
                        "Quartararo masih memuncaki klasemen MotoGP 2022 dengan 219 poin. Bagnaia tepat di belakangnya dengan margin dua angka saja.\n" + "\n" + "\"Fabio jelas adalah orang yang harus dikalahkan. Dia adalah salah satu pebalap terkuat dan juara dunia tahun lalu,\" kata Bagnaia jelang MotoGP Australia, dikutip dari Crash.\n" +
                        "\n" +
                        "\"Namun saya dalam situasi yang lebih baik daripada Fabio. Saya merasa hebat dengan motor saya, saya bisa mendorong, saya bisa menyerang,\" dia menambahkan.\n" +
                        "\n" + "\"Dia lebih berjuang dengan motornya. Memang benar motor kami lebih lengkap,\" Francesco Bagnaia mengungkapkan.\n" +
                        "\n" +
                        "3 Race Pamungkas MotoGP 2022\n" +
                        "MotoGP Australia: 16 Oktober\n" +
                        "MotoGP Malaysia: 23 Oktober\n" +
                        "MotoGP Valencia: 6 November.\n",

                "Jakarta - Dewa United Surabaya merekrut dua pebasket asal Amerika Serikat demi memenuhi target juara Indonesia Basketball League (IBL) musim 2023.\n" +
                        "Dua pemain asing itu ialah Anthony Jonson dan Ramon Galloway. Keduanya dipilih pada IBL Draft, Selasa (11/10/2022) untuk menjadi bagian dari Dewa United.\n" +
                        "\n" +
                        "Anthony merupakan pemain yang bisa bermain di posisi forward dan center. Sedangkan Ramon dapat dimanfaatkan tim guna mengisi posisi guard.\n" +
                        "\n" + "CEO Dewa United Surabaya Michael Oliver Wellerz menyambut positif kehadiran dua rekrutan barunya tersebut. Ia pun berharap keduanya dapat memberikan kontribusi signifikan bagi prestasi tim.\n" +
                        "\n" +
                        "\"Harapannya tentu semoga kedua pemain ini bisa memberikan kontribusi bagi Dewa United Surabaya untuk merealisasikan target juara musim depan,\" kata Michael dalam keterangan resminya, Rabu (12/10/2022).\n" +
                        "\n" + "Sebelum menjadi bagian Dewa United Surabaya, Anthony Johnson terakhir kali bermain di Liga Basket Venezuela memperkuat Taurinos de Aragua. Sedangkan Ramon Galloway bermain untuk San Lazaro Club di Liga Basket Dominika.\n" +
                        "\n" +
                        "Mengenai kehadiran dua pemain asing baru ini, pelatih Dewa United Surabaya Maximiliano Enrique Seigorman mengatakan keduanya sesuai dengan kebutuhan tim. Di mana Dewa United Surabaya membutuhkan peran pemain di posisi guard dan big man.\n" +
                        "\n" +
                        "\"Kedua pemain asing baru ini memang sesuai dengan kebutuhan tim. Kami memang menginginkan adanya sosok yang bisa diandalkan di posisi tersebut,\" kata Maxi.\n" +
                        "\n" +
                        "Tim Dewa United sendiri sudah memulai persiapan IBL 2023 sejak 6 Oktober lalu. Persiapan lebih awal dilakukan Dewa United demi mendapat modal bagus menatap target juara musim depan.\n",

                "Jakarta, CNN Indonesia -- Pembalap Red Bull Max Verstappen menang Formula 1 (F1) Grand Prix (GP) Belgia 2022 di Sirkuit de Spa-Francorchamps, Minggu (28/8).\n" +
                        "Start apik dilakukan pembalap Red Bull Max Verstappen yang langsung memimpi balapan setelah memulai dari posisi ke-14.\n" +
                        "\n" +
                        "Drama langsung terjadi pada awal-awal balapan. Pada lap pertama Lewis Hamilton dari Mercedes melakukan kontak dengan Fernando Alonso dari Alpine Renault, sedangkan pembalap Alfa Romeo Valtteri Bottas bersenggolan dengan Nicholas Latifi dari Williams.\n" +
                        "\n" + "Kecelakaan itu membuat Hamilton dan Bottas tidak bisa melanjutkan balapan di F1 GP Belgia 2022.\n" +
                        "\n" +
                        "Pada lap 35 Verstappen masih di posisi terdepan, disusul rekan satu timnya Sergio Perez dan Carlos Sainz dari Ferrari.\n" +
                        "\n" +
                        "Saat balapan tersisa tiga lap, Verstappen memiliki jarak 17,5 detik atas Perez sebagai pesaing terdekat.\n" +
                        "\n" +
                        "Persaingan sengit terjadi pada Alonso dan Leclerc pada lap-lap terakhir. Pada lap 43, Charles Leclerc menyalip Fernando Alonso guna meraih posisi kelima.\n" +
                        "\n" +
                        "Verstappen akhirnya mengunci kemenangan dengan keunggulan +17,841 detik atas Sergio Perez, disusul Carlos Sainz pada posisi tiga besar.\n" +
                        "\n" +
                        "Kemenangan di F1 GP Belgia 2022 membuat Verstappen menang dalam tiga seri beruntun untuk kedua kalinya pada musim ini (F1 GP Prancis, Hungaria, dan Belgia).\n" +
                        "\n" +
                        "Sebelumnya pembalap asal Belanda itu juga menang dalam tiga seri beruntun di Emilia Romagna, GP Amerika Serikat, dan GP Spanyol.\n" +
                        "\n" +
                        "Hasil positif di F1 GP Belgia mengukuhkan posisi Verstappen pada klasemen F1 2022 dengan 283 poin.\n",

                "Jakarta, CNN Indonesia -- Manchester United akhirnya mengalahkan Omonia Nicosia dengan skor 1-0 dalam laga matchday 4 fase grup Liga Europa 2022/2023, Jumat (14/10) dini hari.\n" +
                        "Selama pertandingan di Old Trafford, Manchester United mendominasi permainan. Sedikitnya 34 tendangan diarahkan ke gawang lawan. Namun hanya satu gol yang tercipta dari tembakan Scott McTominay di masa injury time babak kedua.\n" +
                        "\n" + "Pada awal babak pertama, Manchester United tampak agresif. Beberapa peluang didapat tim Setan Merah, namun usaha mencetak gol masih bisa digagalkan Francis Uzoho.\n" +
                        "\n" +
                        "Marcus Rashford berusaha menembus pertahanan Omonia. Tapi Uzoho mampu menjadi benteng kokoh bagi timnya. Dua peluang emas Rashford digagalkan oleh kiper asal Nigeria itu.\n" +
                        "\n" + "Beberapa peluang kembali didapat skuad Manchester United, mulai dari tembakan Casemiro yang mengenai mistar, hingga aksi Fred yang belum mengenai sasaran.\n" +
                        "\n" +
                        "Pluit akhir babak pertama ditiup. Tak ada gol yang tercipta dari kedua tim.\n" +
                        "\n" +
                        "Pada babak kedua, Uzoho semakin sigap melakukan serangkaian penyelamatan. Para pemain Manchester United mulai dibuat frustrasi. Mereka gagal membobol gawang Uzoho.\n" +
                        "\n" + "Erik ten Hag bereaksi kemudian memasukkan Jadon Sancho, Luke Shaw, hingga Christian Eriksen. Manchester United melakukan serangan bertubi-tubi, namun mereka belum juga berhasil mengubah skor.\n" +
                        "\n" +
                        "Setelah diserang habis-habisan oleh Manchester United, gawang Uzoho akhirnya jebol juga. Pada masa injury time, kemelut di kotak penalti berhasil dimanfaatkan McTominay. Uzoho kini gagal mengantisipasi gol.\n" +
                        "\n" +
                        "Manchester United akhirnya mengantongi kemenangan hingga akhir pertandingan.\n" +
                        "\n" +
                        "Dengan perolehan skor ini, Manchester United masih tertahan di peringkat dua klasemen Grup E dengan poin 9. Sementara itu, Omonia tetap terpuruk di peringkat empat tanpa meraih poin sama sekali.\n" +
                        "\n",

                "Jakarta, CNN Indonesia -- Ketua Umum PBSI Agung Firman Sampurna menekankan tidak ada lagi konflik antara Kevin Sanjaya Sukamuljo dengan Herry Iman Pierngadi.\n" +
                        "Agung menyatakan hal tersebut dalam acara Konferensi Pers Pernyataan PBSI Tentang Permasalahan di Sektor Ganda Putra yang berlangsung secara virtual pada Jumat (30/9) siang.\n" +
                        "\n" +
                        "\"Kami tegaskan konflik tidak ada lagi, saya bisa memahami teman-teman atlet masih muda dan saya pernah muda juga. Gesekan itu terkadang terluap ke publik, terkait masalah kepelatihan kami cari cara. Lanjut terus bisa, suasana baru juga bisa. Intinya masalah di antara kedua pihak itu tidak ada lagi,\" kata Agung dalam sesi tanya jawab.\n" +
                        "\n" + "Agung kembali menegaskan jika Kevin dan Herry tidak lagi berada pada dua kubu berseberangan dan siap menatap Olimpiade 2024.\n" +
                        "\n" +
                        "\"Saya pikir kalau orang sedang marah wajar saja bisa keluar macam-macam. Itu lumrah saja, tapi saya pikir orang menyampaikan narasi harus menyikapi sedang bijak. Teman-teman mau ini dilanjutkan enggak? Kalau perlu dilanjutkan bisa. Kalau perlu dibuatkan ring,\" ucap Agung menjelaskan soal kata-kata yang pernah keluar dari mulut Kevin dan Herry IP.\n" +
                        "\n" + "\"Tapi jujur saya tekankan masalah sudah selesai, kalau kita punya komitmen yang sama ketika ada masalah kecil itu bisa diselesaikan. Yang kita harus tatap adalah Olimpiade 2024 yang perlu persiapan sejak dini. Kami butuh atlet berbakat di Olimpiade dan butuh pelatih berpengalaman agar atlet tampil dalam kondisi terbaiknya. Soal apa yang disampaikan bisa macam-macam. Saya katakan masalah itu sudah selesai,\" sambungnya.\n" +
                        "\n",

                "Jakarta, CNN Indonesia -- Barcelona terancam turun kasta ke Liga Europa setelah hanya mampu bermain imbang 3-3 lawan Inter Milan di matchday keempat Liga Champions.\n" +
                        "Menjamu Inter di Camp Nou, Barcelona sempat mendapat angin surga lewat gol pembuka yang dicetak Ousmane Dembele di menit ke-40. Keunggulan Barca bertahan hingga babak pertama usai.\n" +
                        "\n" +
                        "Akan tetapi, Inter mampu menyamakan kedudukan lima menit setelah kick off babak kedua lewat aksi Nicolo Barella. Inter bahkan berbalik unggul di menit ke-63 berkat gol Lautaro Martinez.\n" +
                        "\n" + "Pada menit ke-82, Robert Lewandowski sukses menyamakan skor 2-2. Tujuh menit berselang, Robin Gosens membawa Inter kembali unggul sebelum dibalas gol telat Lewandowski di masa injury time untuk memastikan skor akhir 3-3.\n" +
                        "\n" +
                        "Hasil ini membuat Barcelona tertahan di peringkat ketiga Grup C dengan perolehan empat poin dari empat laga. Sementara Inter bertahan di posisi kedua dengan tujuh poin.\n" +
                        "\n" +
                        "Sementara Bayern Munchen semakin kukuh di puncak klasemen dengan nilai sempurna, yakni 12 poin dari empat pertandingan. Adapun Viktoria Plzen jadi tim juru kunci hasil dari empat kekalahan beruntun.\n" +
                        "\n" +
                        "Barcelona dipastikan turun kasta ke Liga Europa jika Inter sukses mengalahkan Plzen di matchday kelima, 26 Oktober mendatang. Sementara Inter Milan berhak mendampingi Bayern yang lebih dulu memastikan satu tempat ke babak 16 besar.\n" +
                        "\n" + "Jika Inter kalah dari Bayern di laga terakhir, dengan skenario tersebut, Inter bakal tetap unggul head to head atas Barcelona sekalipun tim asal Catalunya itu meraup dua kemenangan beruntun. Inter dan Barcelona akan sama-sama mengoleksi 10 poin.\n" +
                        "\n" +
                        "Namun Barcelona masih punya kesempatan lolos ke fase gugur jika Inter terpeleset di dua laga tersisa. Dengan catatan, Barcelona memenangi dua laga terakhir lawan Bayern dan Plzen.\n" +
                        "\n"

        };

        String arrUsia17[]={
                "SU", "SU", "SU", "SU", "SU", "13+", "17+"
        };

        String arrTgl17[]={
                "Kamis, 13 Okt 2022 21:00 WIB", "Selasa, 11 Okt 2022 22:20 WIB", "Rabu, 12 Okt 2022 13:35 WIB", "Minggu, 28 Agu 2022 21:41", "Jumat, 14 Okt 2022 05:34 WIB", "Jumat, 30 Sep 2022 14:44 WIB", "Kamis, 13 Okt 2022 09:50 WIB"
        };

        int arrImage17[]={
                R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img6, R.drawable.img7, R.drawable.img4, R.drawable.img5
        };



        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        if (usia < 13){
            recyclerView.setAdapter(new SportAdapter(this, arrJudul13, arrKategori13, arrKonten13, arrTgl13, arrUsia13, arrImage13));
        }
        else if (usia < 17 && usia >= 13 ) {
            recyclerView.setAdapter(new SportAdapter(this, arrJudul, arrKategori, arrKonten, arrTgl, arrUsia, arrImage));
        } else {
            recyclerView.setAdapter(new SportAdapter(this, arrJudul17, arrKategori17, arrKonten17, arrTgl17, arrUsia17, arrImage17));
        }

    }
}