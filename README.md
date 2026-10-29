# Gebelik Takibi — Android Studio proje kaynakları

Türkçe, çevrimdışı çalışan basit gebelik haftası/günü hesaplama uygulaması.

## Özellikler
- Son adet tarihinin ilk günü veya tahmini doğum tarihiyle hesaplama
- Gebelik haftası + gün, toplam gebelik günü
- Tahmini doğum tarihi ve kalan gün
- 40 haftalık ilerleme çubuğu ve trimester bilgisi
- Önemli gebelik dönüm noktaları
- İnternet izni istemez; girilen tarihleri kaydetmez

## APK oluşturma
Bu paket kaynak proje içerir; hazır/derlenmiş APK değildir.
1. Bilgisayarda Android Studio kurun.
2. Android Studio'da **Open** ile `GebelikTakibi` klasörünü açın.
3. Gradle senkronizasyonunun tamamlanmasını bekleyin.
4. **Build > Build Bundle(s) / APK(s) > Build APK(s)** seçin.
5. APK, genellikle `app/build/outputs/apk/debug/app-debug.apk` konumunda oluşur.

## Not
Gebelik haftası son adet tarihine göre standart 280 günlük tahminle hesaplanır. Bu bir tıbbi cihaz değildir ve doktor değerlendirmesinin yerine geçmez.
