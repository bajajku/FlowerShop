package sheridan.bajajku.flowershop.data.repository

import sheridan.bajajku.flowershop.domain.Flower

interface FlowerDataRepository {
        suspend fun getAllFlowers(): List<Flower>
}