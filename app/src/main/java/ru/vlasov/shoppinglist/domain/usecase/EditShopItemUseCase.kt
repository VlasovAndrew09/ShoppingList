package ru.vlasov.shoppinglist.domain.usecase

import ru.vlasov.shoppinglist.domain.ShopItem
import ru.vlasov.shoppinglist.domain.ShopListRepository

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)
    }
}