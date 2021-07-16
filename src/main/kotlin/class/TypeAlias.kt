package `class`


/**
 * Çok uzun değişken varsa kısaca kullanıma sağlamak için yazılıyor
 * typealias yaptığımızda yeni bir class yazmıyoruz.
 *
 *
 * nested ve local typeAlias kullanımı desteklenmiyor.
 * Bu yüzden üst kısma yazıyoruz.
 *
 * wrapper gibi denir ama arkada yeni bir class oluşturulmaz.
 *
 * Yeni bir class oluşturmazlar . Sadece etiketleme yaparlar.
 *
 */


typealias AccountReferanceVM = ProjectContractChargingPeriodProjectAccountReferenceVM


fun main() {
    // val projectContractChargingPeriodProjectAccountReferenceVM : ProjectContractChargingPeriodProjectAccountReferenceVM

    val accountReferenceVM: AccountReferanceVM

}

data class ProjectContractChargingPeriodProjectAccountReferenceVM(
    val string: String?
)