package ru.vlasov.shoppinglist.domain.usecase

import ru.vlasov.shoppinglist.domain.ShopItem
import ru.vlasov.shoppinglist.domain.ShopListRepository

class DeleteShopItemUseCase(private val shopListRepository: ShopListRepository) {

    suspend fun deleteShopItem(shopItem: ShopItem) {
        shopListRepository.deleteShopItem(shopItem)
    }
}