package uz.pdp.TestsMVPK.models

import uz.pdp.TestsMVPK.AppContract.AppContract.ModelInterface
import uz.pdp.TestsMVPK.Enum.CategoryEnum
import java.util.*

class ModelImpl : ModelInterface {
    private lateinit var data: ArrayList<QuestionData>
    override fun getQuestionData(type: CategoryEnum): ArrayList<QuestionData> {
        when (type) {
            CategoryEnum.FIZIKA -> {
                data = ArrayList()
                data.add(QuestionData(".... deb, moddani tashkil etgan zarralar, o'zgarmay qolgan holda sodir bo'lgan hodisalarga aytiladi.",
                        "Fizik hodisa", "mexanik hodisa", "issiqlik hodisasi", "Yorig'lik hodisasi", "Fizik hodisa"))
                data.add(QuestionData("Yuza birligiga tik ravishda qo'yilgan kuchga to'g'ri keladigan -fizik kattalikka ... deyiladi. ",
                        "Kuch", "Bosim", "Yuza", "Massa", "Bosim"))
                data.add(QuestionData("Tezlik birligi o'lchovi", "m/s", "J", "kg", "Kl", "m/s"))
                data.add(QuestionData("Kuch momenti ifodasini toping ", "M1=M2", "F * l", "mg/2", "mg", "F * l"))
                data.add(QuestionData("Jism o'z harakati davomida chizgan chizig'i ………… deyiladi", "Bosib o'tilgan yo'l", "Traektoriya", "Mexanik harakat", "Tezlik", "Traektoriya"))
                data.add(QuestionData("Bosib o'tilgan yo'l deb ...", "Boshlang'ich va oxirgi vaziyat orasidagi masofaga", "Ma'lum bir vaqt davomida jism harakat qilgan traektoriya uzunligiga", "Mexanik harakatga ", "Yo'nalishli kesma", "Ma'lum bir vaqt davomida jism harakat qilgan traektoriya uzunligiga"))
                data.add(QuestionData("v qanday kattalik", "Kuchlanish", "Tok kuchi", "Quvvat", "Tezlik", "Tezlik"))
                data.add(QuestionData("P qanday kattalik", "Kuchlanish", "Tok kuchi", "Quvvat", "Tezlik", "Quvvat"))
                data.add(QuestionData("I qanday kattalik", "Kuchlanish", "Tok kuchi", "Quvvat", "Tezlik", "Tok kuchi"))
                data.add(QuestionData("U qanday kattalik", "Kuchlanish", "Tok kuchi", "Quvvat", "Tezlik", "Kuchlanish"))
            }
            CategoryEnum.MATEMATIKA -> {
                data = ArrayList()
                data.add(QuestionData("Tengsizlikni  barcha  tub  yechimlarini  yozing.  59<=y<67", "61", "59", "59,61,67", "59,61", "59,61"))
                data.add(QuestionData("5 Million 67 ming 890 soni raqamlar bilan yozing?",
                        "567890", "50067890", "5067890", "5678900", "50067890"))
                data.add(QuestionData("3*5<345 tenglik o‘rinli bo‘lishi uchun yulduzcha o‘rniga qanday raqam qo‘yish o‘rinli?", "1,2,3,4", "0,1,2,3,4", "0,1,2,3", "2,3,5", "0,1,2,3"))
                data.add(QuestionData("258314, 249998, 249989 va 249899 sonlardan eng kichigi?", "1", "4", "2", "3", "4"))
                data.add(QuestionData("Son nurida O(0), A(13), B(25) nuqtalar belgilangan OB kesma OA kesmadan qancha uzun?", "13 ta birlik kesmaga", "9 ta birlik kesmaga", "12 ta ikkilik kesmaga", "12 ta birlik kesmaga", "12 ta birlik kesmaga"))
                data.add(QuestionData("Kamayuvchi 35 taga ortib,  ayriluvchi 25 taga ortsa, ayirma qanday o‘zgaradi?", "10taga ortadi", "60taga  kamayadi", "50taga  kamayadi", "60taga  ortadi", "10taga ortadi"))
                data.add(QuestionData("459 sonini  qanday  songa  bo’lganda  to’liqsiz  bo’linma  18,qoldiq  9  bo’ladi.",
                        "24", "23", "25", "26", "25"))
                data.add(QuestionData("Poezd  ustun  yonidan  25sekundda  o’tib  ketdi,  tezligi  20m/s  bo’lsa  uning  uzunligini  toping.",
                        "400", "550", "450", "500", "500"))
                data.add(QuestionData("To’g’ri  to’rtburchakning  asosi  8sm,  balandligi  undan  12sm  ortiq.Uning  perimetrini  toping.", "20", "96", "28", "56", "56"))
                data.add(QuestionData("Yuzi  tomonlari  45sm  va  20sm  bo’lgan  to’g’ri  to’rtburchak  yuziga  teng  bo’lgan  kvadrat  tomanini  toping.", "900", "65", "30", "32", "30"))
                data.add(QuestionData("Yulduzcha  o’rniga  qanday  raqam  yozish  mumkin:210=*·3·5·7", "4", "2", "6", "8", "2"))
            }
            CategoryEnum.ONATILI -> {
                data = ArrayList()
                data.add(QuestionData("Alisher Navoiy qachon tug'ilgan?", "1442", "1441", "1454", "1443", "1441"))
                data.add(QuestionData("Birinchi shaxs kishilik olmoshlariga qaysi so'zlar kiradi?", "men,biz", "sen,biz", "u,ular", "bu,shu", "men,biz"))
                data.add(QuestionData("Birlik sonda hurmat ma'nosida qaysi kishilik olmoshi ishlatiladi?", "ular", "siz", "sen", "u", "siz"))
                data.add(QuestionData("Belgilash olmoshlariga qaysi so'zlar kiradi?", "har", "agar", "ular", "zeroki", "har"))
                data.add(QuestionData("Biriktiruv ,ayiruv,zidlov bog'lovchilari ,ham,na bog'lovchi-yuklamalari qanday bog'lovchilardir?", "teng bog'lovchi", "zidlov bog'lovchilari ", "ko'rsatish bog'lovchilari", "ayiruv bo'lovchilari", "teng bog'lovchi"))
                data.add(QuestionData("Yozuvda shart ergash gap hokim gapdan doimo nima bilan ajratiladi?", "vergul", "nuqta", "undov", "chiziqcha", "vergul"))
                data.add(QuestionData("Uchinchi shaxs kishilik olmoshlariga qaysi so'zlar kiradi?", "sen,siz", "sen,biz", "u,ular", "bu,shu", "sen,siz"))
                data.add(QuestionData("Alisher Navoiy asari qaysi?", "Panj-Ganj", "Lison-ut Tayr", "Shaytanat", "Qadimgi xaqlardan qolgan yodgorliklar", "Lison-ut Tayr"))
                data.add(QuestionData("Chunki,shuning uchun,zeroki qanday bog'lovchidir?", "ko'rsatish bog'lovchilari", "sabab bog'lovchi", "teng bog'lovchi", "zidlov bog'lovchilari ", "sabab bog'lovchi"))
                data.add(QuestionData("Ikkinchi shaxs kishilik olmoshlariga qaysi so'zlar kiradi?", "sen,biz", "u,ular", "sen,siz", "bu,shu", "sen,siz"))
            }
            CategoryEnum.INFORMATIKA -> {
                data = ArrayList()
                data.add(QuestionData("Informatika faniga qachon asos solingan?", "XX-asr 1980-yil", "XX-asr 1950-yil", "XX-asr 1960-yil", "XX-asr 1955-yil", "XX-asr 1950-yil"))
                data.add(QuestionData("IL  ni ma’nosini toping.", "50", "49", "51", "48", "49"))
                data.add(QuestionData("Mulohaza nima?", "Biror voqea haqidagi habar", "Narsa va hodisalarning sifatini anglatuvchi darak gap", "Narsa va hodisalar haqidagi fikrlar.", "TJY", "Narsa va hodisalarning sifatini anglatuvchi darak gap"))
                data.add(QuestionData("Qaysi qatorda mantiqiy amallar to’g’ri berilgan?", "AND,OR, NOT", "AND,TO,BUT ", "BUT,OR,AND", "TJY", "AND,OR, NOT"))
                data.add(QuestionData("Axborot  o‘lchov birliklari qaysi qatorda to‘g‘ri tartibda ko‘rsatilgan?", "bit, bayt, kbayt, gbayt, mbayt", "bit, bayt, kbayt, mbayt, gbayt", "kbayt, bayt, mbayt, gbayt, bit", "kbayt, bayt, mbayt, tbayt, gbayt, bit", "bit, bayt, kbayt, mbayt, gbayt"))
                data.add(QuestionData("Kompyuterning asosiy qurilmasi bo’lgan qatorni toping?", "klaviatura, vinchester, sichqoncha, printer", "modem,sicqoncha", "protsessor, klaviatura, printer, sichqoncha", "ekran, protsessor, klaviatura", "ekran, protsessor, klaviatura"))
                data.add(QuestionData("Agar axborot 14 bayt bo‘lsa u necha bitdan iborat?", "110", "122", "112", "132", "112"))
                data.add(QuestionData("Tasvirni chop etish  uchun qaysi klavishlardan foydalanamiz?", "Ctrl+R", "Ctrl+E", "Ctrl+P", "Ctrl+S", "Ctrl+P"))
                data.add(QuestionData("Xotiradagi rasmni ekranga chiqarishda qaysi klavishlarda foydalanamiz?", "Ctrl+R", "Ctrl+O", "Ctrl+P", "Ctrl+S", "Ctrl+O"))
                data.add(QuestionData("Malumotlar ombori nima?", "Turli sohadagi malumotlar to’plami", "Borliqni malum bir sohasi bo’yicha birlashtirilgan ma’lumotlar to’plami.", "Axborotlar to’plami", "TJY", "Borliqni malum bir sohasi bo’yicha birlashtirilgan ma’lumotlar to’plami."))
            }
            CategoryEnum.GEOGRAFIYA -> {
                data = ArrayList()
                data.add(QuestionData("O’zbekistonda tabiiy gaz birinchi navbatda qaysi davlatlarga yuboriladi?", "Xitoy, Rossiya", "Turkiya, Yaponiya", "Qozog’iston, Qirg’iziston", "Turkiya, Ozarbayjon", "Xitoy, Rossiya"))
                data.add(QuestionData("Chorvachilikni nechta tarmoq tashkil qiladi?", "6 ta", "8 ta", "7 ta", "9 ta", "9 ta"))
                data.add(QuestionData("Yoqilg’i resurslari berilgan qator qaysi?", "o’tin, gaz, titan, rux", "ko’mir, neft, torf, slanes ", "Neft, ko’mir, gaz, kumish", "TJY", "ko’mir, neft, torf, slanes "))
                data.add(QuestionData("O’zbekiston milliy iqtisodiyotida nechta tarmoqlararo majmualar shakllangan?", "6 ta", "8 ta", "7 ta", "9 ta", "6 ta"))
                data.add(QuestionData("Yuqori xosilli qishloq xo’jaligini vujudga keltirish uchun nima zarur?", "ekstensiv xo’jalik", "intensiv xo’jalik", "melioratsiya", "mexanizatsiya", "melioratsiya"))
                data.add(QuestionData("Respublikamizdagi dastlabki gaz quvurlari qayerda qurilgan?", "Fargona vodiysida", "Buxoro, Toshkentda", "Zarafshon, Surxondaryoda", "Qurilmagan", "Fargona vodiysida"))
                data.add(QuestionData("Maxsulot tannarxi deb nimaga aytiladi?", "tarkibida ko’mir bo’lmagan maxsulotga", "maxsulot birligini olish uchun ketadigan xarajatga", "tarkibidaga moddalar almashishiga", "TJY", "maxsulot birligini olish uchun ketadigan xarajatga"))
                data.add(QuestionData("Dastlabki ko’mir qachon va qayerdan olingan?", "1905 yil Toshkentdan ", "1950 yil Angrendan", "1948 yil Mingbuloqdan", "1948 yil Marg'ilondan", "1950 yil Angrendan"))
                data.add(QuestionData("O’zbekistonda birinchi GES qachon va qayerda qurilgan?", "Sirdaryoda 1926 yili", "Bo’zsuvda 1926 yili", "Xishravda 1926 yili", "Marg'ilonda 1920-yili", "Bo’zsuvda 1926 yili"))
                data.add(QuestionData(" AES lar qayerlarda quriladi?", "Yoqilg’i arzon, energiya kam ketadigan joylarda", "Yoqilg’i qiymat, energiya kam talab qilinadigan joylarda", "Yoqilg’i qiymat, elektr energiya ko’p talab qilinadigan joylarda", "TJY", "Yoqilg’i qiymat, elektr energiya ko’p talab qilinadigan joylarda"))
            }
            CategoryEnum.BIOLOGIYA -> {
                data = ArrayList()
                data.add(QuestionData("Daraxtlar, butalar,yarim butalar, 1 yillik, 2yillik va ko’p yillik o’tlar nimalar hisoblaniladi?", "o’simlikning  hayotiy  shakllari", "o’simlikning  barglari ", "o’simlikning   tana  qismlari ", "o’simlikning ildizlari ", "o’simlikning  hayotiy  shakllari"))
                data.add(QuestionData("Oltinga  o’xshatish   qaysi   faslga  xos?", "bahor", "qish", "kuz", "yoz", "kuz"))
                data.add(QuestionData("Xujayra  qaysi   olim  tomonidan   kashf  qilingan?", "Robert  Tuk", "Pryashnikov", "Gryu", "Lomonosov", "Robert  Tuk"))
                data.add(QuestionData("’’Botane’’ qanday   ma’noni  anglatadi?", "o’t,  o’lan", "gul", "barg", "ko'chat", "o’t,  o’lan"))
                data.add(QuestionData("Ildizmevali   o’simlikni  ko’rsating? ", "bodom,sabzi", "lavlagi,  pomidor", "sabzi,  lavlagi", "bodring, anjir", "sabzi,  lavlagi"))
                data.add(QuestionData("Kuzda  o’simliklarda   sodir   bo’ladigan  muxim   biologik  o’zgarishlardan  biri qaysi   jarayon   hisoblanadi?", "hazonrezgillik", "xujayralar  xosil  bo’lishi  jarayoni", "poyalarni  qalinlashish  jarayoni", "qurish jarayoni", "hazonrezgillik"))
                data.add(QuestionData("Tanasida  200L  gacha  suv  saqlaydigan    kaktus  qaysi?", "rafleziya", "meksika  kaktusi", "Afrika  kaktusi", "Angliya kaktusi", "meksika  kaktusi"))
                data.add(QuestionData("Ildiz,   poya,  barg   qanday   organ   xisoblanadi?", "vegetativ", "generative", "eng  kerakli  organ", "ortiqcha organ", "v1"))
            }
            CategoryEnum.ANDROID -> {
                data = ArrayList()
                data.add(QuestionData("Androidning 9 - versiyasi qanday nomlanadi", "Lollipop", "Pie", "Nougat", "Oreo", "Pie"))
                data.add(QuestionData("Android Studioda refactor qilish klavishlari qaysi?", "Alt+F5", "Alt+F6", "Shift+F5", "Shift+F6", "Shift+F6"))
                data.add(QuestionData("Androidning 8 - versiyasi qanday nomlanadi", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Oreo"))
                data.add(QuestionData("Android Studioda Editordagi bir xil matnlarni belgilash klavishlari qaysi?", "ALT+H", "CTRL+H", "ALT+J", "SHIFT+K", "ALT+J"))
                data.add(QuestionData("Androidning 5 - versiyasi qanday nomlanadi", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Lollipop"))
                data.add(QuestionData("Android Studioda Joriy kursordagi so'z(lar)ni belgilash uchun qaysi klavishlar ishlatiladi?", "ALT+W", "SHIFT+W", "CTRL+W", "ALT+E", "CTRL+W"))
                data.add(QuestionData("Androidning 6 - versiyasi qanday nomlanadi", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Marshmallow"))
                data.add(QuestionData("Android Studioda Qaysi klavishlar yordamida tavsiya qilinadigan variantlarni chiqarish mumkin?", "CTRL+SPACE", "CTRL+B", "ALT+SPACE", "SHIFT+X", "CTRL+SPACE"))
                data.add(QuestionData("Androidning 7 - versiyasi qanday nomlanadi", "Lollipop", "Marshmallow", "Nougat", "Oreo", "Nougat"))
                data.add(QuestionData("Android Studioda Xatolikni tezkor to'g'irlash klavishlari qaysi", "CTRL+Q", "CTRL+ENTER", "ALT+ENTER", "ALT+D", "ALT+ENTER"))
            }
            CategoryEnum.KIMYO -> {
                data = ArrayList()
                data.add(QuestionData("Uchinchi energetic pog'onada ko'pi bilan nechta electron bo'lishi mumkin?",
                        "3", "9", "36 ", "27", "27"))
                data.add(QuestionData("Quyidagilardan qaysilari SI birlikari hisoblanadi?\nI. Mol II. Joul\n" +
                        "III. Kg IV. K", "I, III, IV", " II, III, IV", " III, IV", " I, II, III, IV", "I, III, IV"))
                data.add(QuestionData("Quyida keltirilgan moddalarning qaysi biri оddiy modda hisoblanadi?",
                        "PH₃", "P₂O₅", "P₂O₃ ", "P₄", "P₄"))
                data.add(QuestionData("Uglerodning allotropik shaklini ko'rsating?",
                        "Kvars", "Fosgen", "Olmos", "Korund", "Olmos"))
                data.add(QuestionData("Quyidagi ta'riflarning qaysi birida molekulaga to'g'ri ta'rif berilgan?\n" +
                        "1)  Molekula - moddaning fizik xossalarini o'zida saqlab qoluvchi eng kichik zarrachasidir.\n" +
                        "2)  Molekula - moddaning kimyoviy xossalarini o'zida saqlab qoluvchi eng kichik zarrachasidir.\n" +
                        "3)  Molekula - moddaning rangi va hidini saqlab qoluvchi eng kichik zarrachasidir.",
                        "faqat 1", "faqat 2", "faqat 3", "1 va 2", "faqat 2"))
                data.add(QuestionData("Qanday moddalar toza moddalar deb aytiladi?\n" +
                        "1)  Faqat bitta element atomlaridan tashkil topgan moddalar toza moddalar deyiladi.\n" +
                        "2) kimyoviy xossalari turg'un tarkibi o'zgarmaydigan va chet moddalar tutmagan moddalar toza moddalar deyiladi.\n" +
                        "3) Fizikaviy xossalari o'zgarmaydigan moddalar toza moddalar deyiladi?",
                        "faqat 1", "faqat 2", "faqat 3", "1 va 2", "faqat 2"))
                data.add(QuestionData("Aralashma deb nimaga aytiladi?\n" +
                        "1)  tarkibi ikki va undan ortiq moddalardan iborat bo'lgan sistemalar aralashmalar deyiladi.\n" +
                        "2)  Fizikaviy xossalari o'zgaruvchan bo'lgan moddalar aralashmalar deyiladi.\n" +
                        "3) Ikki va undan ortiq element atomlaridan tashkil topgan moddalar aralashmalar deyiladi",
                        "faqat 1", "faqat 2", "faqat 3", "1 va 2", "faqat 1"))
                data.add(QuestionData("Quyida keltirilgan ta'riflarning qaysi biri M. Lomonosov kashf etgan moddalar massasining saqlanish qonunini ifodalaydi?",
                        "Har qaysi kimyoviy toza modda qaerda bo'lishidan va olinish usulidan qat'i nazar, bir xil o'zgarmas tarkibga ega bo'ladi",
                        "Kimyoviy reaksiya kirishgan moddalarning massasi hosil bo'lgan moddalarning massasiga teng",
                        "Kimyoviy elementlarning hamda ular hosil qiladigan oddiy va murakkab moddlarning xossalari shu element atomlari yadrosi zaryadining miqdorida davriy ravishda bog'liqdir.",
                        "Bir xil sharoitda turli xil gazlarning barobar xajmlarida molekulalar soni bir xil bo'ladi.",
                        "Kimyoviy reaksiya kirishgan moddalarning massasi hosil bo'lgan moddalarning massasiga teng"))
                data.add(QuestionData("Quyidagi javobning qaysi bandi ma'noga ega emas?\n" +
                        "1)  Normal sharoitda 0,5 mol kislorod 11,2  xajmni egallaydi.\n" +
                        "2) Normal sharoitda 2 mol kislorod 22,4 xajmni egallaydi.\n" +
                        "3) Normal sharoitda 3 mol kislorod 44,8 xajmni egallaydi?",
                        "2 va 3", "faqat 1", "faqat 2", "faqat 3", "2 va 3"))
                data.add(QuestionData("Qadimda insonlarda qaysi oddiy moddalar ma'lum bo'lgan? 1) oltin; 2) kumush; 3) mis; 4) qo'rg'oshin; 5) alyuminiy; 6) brom",
                        "1,2,3,5", "2,3,4,5", "l,2,3,4", "1,2,4", "l,2,3,4"))
                data.add(QuestionData("D.I. Mendeleyev davriy qonunni kashf etgan paytda fanda nechta kimyoviy element ma'lum edi?",
                        "60", "63", "65", "67", "63"))
            }
            CategoryEnum.ENGLISH -> {
                data = ArrayList()
                data.add(QuestionData("Which American president appears on a one dollar bill?",
                        "George Washington", "Thomas Jefferson",
                        "Abraham Lincoln",
                        "Benjamin Franklin", "George Washington"))
                data.add(QuestionData("What is the shape of the toy invented by Hungarian professor Ernő Rubik?", "Sphere", "Cube",
                        "Cylinder",
                        "Pyramid", "Cube"))
                data.add(QuestionData("How many colors are there in a rainbow?", "8", "9", "10", "7", "7"))
                data.add(QuestionData("Which of these colours is NOT featured in the logo for Google?", "Yellow",
                        "Blue", "Pink",
                        "Green", "Pink"))
                data.add(QuestionData("Who is depicted on the US hundred dollar bill?", "George Washington", "Benjamin Franklin",
                        "Abraham Lincoln",
                        "Thomas Jefferson", "Benjamin Franklin"))
                data.add(QuestionData("What do the letters of the fast food chain KFC stand for?", "Kentucky Fresh Cheese",
                        "Kibbled Freaky Cow",
                        "Kiwi Food Cut", "Kentucky Fried Chicken", "Kentucky Fried Chicken"))
                data.add(QuestionData("The Flag of the European Union has how many stars on it?", "13", "11", "12", "14", "12"))
                data.add(QuestionData("What is the name of NASA\'s most famous space telescope?", "Big Eye",
                        "Death Star",
                        "Millenium Falcon", "Hubble Space Telescope", "Hubble Space Telescope"))
                data.add(QuestionData("What geometric shape is generally used for stop signs?", "Hexagon",
                        "Circle", "Octagon",
                        "Triangle", "Octagon"))
                data.add(QuestionData("Which company does Android OS belong to?", "Amazon", "Google", "Microsoft", "Yandex", "Google"))
            }
            CategoryEnum.TARIX -> {
                data = ArrayList()
                data.add(QuestionData("O'zbekiston Respublikasi Davlat   bayrog'  qachon qabul qilingan.", "1991  yil 1 sentyabr", "1991 yil 18 noyabr", "1991 yil 31 avgust", "1992 yil  2  iyul", "1991 yil 18 noyabr"))
                data.add(QuestionData("Qadimgi dunyoning nechta  mo'jizasi bor?", "5 ta", "8 ta", "6 ta", "7 ta", "7 ta"))
                data.add(QuestionData("Globusni  birinchi bo'lib kim yasagan", "Ibn Sino", "Xorazimiy", "Beruniy", "Yassaviy", "Beruniy"))
                data.add(QuestionData("Algebra  algaritim  atamalari  kimning nomidan olingan.", "Ibn Sino", "Xorazimiy", "Beruniy", "Yassaviy", "Xorazimiy"))
                data.add(QuestionData("\"Tib qonunlari\"  asrining mualifi kim.", "Ibn Sino", "Xorazimiy", "Beruniy", "Yassaviy", "Ibn Sino"))
                data.add(QuestionData("Chingisxon qachon vatanimizga bostirib kirgan?", "1217 yil", "1218 yil", "1219 yil", "1216 yil", "1219 yil"))
                data.add(QuestionData("Dukchi Eshon boshchiligidagi qo'zg'olon nechanchi yilda bo'lgan?", "1878-yil 10-mayda", "1879-yil 15-mayda ", "1890-yil 13-mayda ", "1898 yil 17-mayda", "1898 yil 17-mayda"))
                data.add(QuestionData("Chorizmning Turkistonni bosib olishidagi asl maqsadi nima edi?", "O'lkadagi tabiiy boyliklarga ega bo'lish", "Paxta xom ashyosini qo'lga kiritish va mustamlaka hududiga ega b o'lish", "Angliyaning bosqinchilik siyosatiga xaiaqit berish maqsadida", "Rossiyadagi ishsizlarni ish bilan ta'minlash maqsadida", "Angliyaning bosqinchilik siyosatiga xaiaqit berish maqsadida"))
                data.add(QuestionData("Qanday harakatga xalq harakati deyiladi?", "Norozilik tufayli sodir etilgan harakat", "Mavjud tuzumdagi siyosatdan norozi bo'lgan muayyan xalq, ijtimoiy guruh, qatlamlarning g'alayonlari, qo'zg'olonlariga ", "Muayyan odamlar guruhining harakatiga ", "Harbiy qismning harakatiga ", "Mavjud tuzumdagi siyosatdan norozi bo'lgan muayyan xalq, ijtimoiy guruh, qatlamlarning g'alayonlari, qo'zg'olonlariga "))
                data.add(QuestionData("Turkiy xalqlar jadidchilik harakatining asoschisi va g'oyaviy rahbari kim?", "Mustafo Cho'qayev", "Anvar poshsho", "Ismoil G’aspirali", "A.Avloniy", "Ismoil G’aspirali"))
            }
            else -> {
            }
        }
        return data
    }
}