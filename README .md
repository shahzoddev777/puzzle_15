# Puzzle 15 🧩

**Puzzle 15** — bu klassik 15-o'yin (Fifteen Puzzle) asosida yaratilgan Android ilova. O'yinchi 4x4 katakchadagi 1 dan 15 gacha raqamlangan bo'laklarni bo'sh joy yordamida siljitib, ularni tartib bilan joylashtirishi kerak.

> Puzzle 15 — bu dunyodagi eng mashhur mantiqiy o'yinlardan biri. U 1870-yillarda AQSHda ixtiro qilingan va qisqa vaqt ichida butun dunyoga tarqalgan.

---

## 📱 Ekranlar

- **Bosh sahifa (Home)** — foydalanuvchi ismini kiritadi, o'yinni boshlaydi, oldingi o'yinni davom ettiradi, "Info" bo'limiga o'tadi yoki ilovadan chiqadi.
- **O'yin sahifasi (Game)** — 4x4 pazl maydoni, hisoblagich (harakatlar soni), qayta boshlash va orqaga qaytish tugmalari.
- **Natijalar sahifasi (Record)** — o'yin yakunlangach joriy natija va eng yaxshi 3 ta natija (Top 3) ko'rsatiladi.
- **Ma'lumot sahifasi (Info)** — o'yin haqida qisqacha ma'lumot va ijtimoiy tarmoqlarga havolalar (Instagram, GitHub, Telegram).

---

## ✨ Asosiy imkoniyatlar

- 🎲 Har safar tasodifiy, lekin **yechilishi mumkin bo'lgan** (solvable) pazl generatsiya qilinadi (inversiya soni algoritmi orqali tekshiriladi).
- 🔢 Harakatlar soni (score) hisoblanadi — kamroq harakat bilan yechish yaxshiroq natija hisoblanadi.
- 💾 O'yin holati `SharedPreferences` orqali saqlanadi — ilovadan chiqib qayta kirganda o'yin davom ettiriladi.
- 🏆 Eng yaxshi 3 ta natija (ism + harakatlar soni) saqlanadi va ko'rsatiladi.
- 🔊 Har bir harakatda tovush effekti chiqadi.
- 🔁 O'yinni istalgan vaqtda qayta boshlash (Restart) imkoniyati.
- 👤 Foydalanuvchi ismini kiritish va natijalarda shu ism bilan ko'rsatilishi.

---

## 🛠 Texnologiyalar

- **Til:** Java
- **Platforma:** Android (AppCompatActivity)
- **Ma'lumot saqlash:** SharedPreferences
- **UI komponentlar:** RelativeLayout, TextView, AppCompatImageButton, EdgeToEdge (Insets bilan ishlash)

---

## 📂 Loyiha tuzilishi

```
com.example.task_14_1
├── HomeActivity.java     // Bosh sahifa: ism kiritish, start, davom ettirish, info, exit
├── GameActivity.java     // O'yin logikasi: pazl generatsiyasi, harakatlar, saqlash
├── RecordActivity.java   // Natijalar va Top 3 reyting
└── InfoActivity.java     // Ilova haqida ma'lumot va ijtimoiy tarmoqlar
```

---

## ▶️ O'rnatish va ishga tushirish

1. Loyihani Android Studio'da oching.
2. Gradle sinxronizatsiyasi tugashini kuting.
3. Qurilma yoki emulyatorni tanlang va **Run** tugmasini bosing.

---

## 🎮 Qanday o'ynash kerak

1. Bosh sahifada ismingizni kiriting va **Start** tugmasini bosing.
2. Bo'sh katakka tutash (yuqori, quyi, chap, o'ng) raqamga bosib, uni siljiting.
3. Barcha raqamlarni 1 dan 15 gacha tartib bilan joylashtiring — bo'sh joy oxirgi (o'ng pastki) katakda bo'lishi kerak.
4. Pazl yechilganda natijalar sahifasiga o'tasiz va harakatlar soningiz saqlanadi.

---

## 👨‍💻 Muallif

**Shahzodbek**
- GitHub: [shahzoddev777](https://github.com/shahzoddev777)
- Telegram: [Shahzodbek_reyimboyev](https://t.me/Shahzodbek_reyimboyev)
- Instagram: [shahzodbek.r__](https://instagram.com/shahzodbek.r__)

---

## 📄 Litsenziya

Ushbu loyiha shaxsiy/ta'lim maqsadida yaratilgan.
