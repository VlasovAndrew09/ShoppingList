package ru.vlasov.shoppinglist.domain.usecase

import ru.vlasov.shoppinglist.domain.ShopItem
import ru.vlasov.shoppinglist.domain.ShopListRepository

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: Int): ShopItem {
        return shopListRepository.getShopItem(shopItemId)
    }
}