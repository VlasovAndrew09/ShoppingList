package ru.vlasov.shoppinglist.domain.usecase

import androidx.lifecycle.LiveData
import ru.vlasov.shoppinglist.domain.ShopItem
import ru.vlasov.shoppinglist.domain.ShopListRepository

class GetShopListUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopList(): LiveData<List<ShopItem>> {
        return shopListRepository.getShopList()
    }
}