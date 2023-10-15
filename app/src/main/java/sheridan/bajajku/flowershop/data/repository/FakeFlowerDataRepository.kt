package sheridan.bajajku.flowershop.data.repository

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import sheridan.bajajku.flowershop.data.local.fakeFlowerList
import sheridan.bajajku.flowershop.domain.Flower
import javax.inject.Inject

class FakeFlowerDataRepository @Inject constructor(): FlowerDataRepository {

    override suspend fun getAllFlowers(): List<Flower> =
        withContext(Dispatchers.IO){
            fakeFlowerList
        }
}
