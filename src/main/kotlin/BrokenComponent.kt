import dagger.Component
import javax.inject.Inject

class BrokenComponent @Inject constructor() {

    @Component
    interface Factory {
        fun create(): BrokenComponent
    }
}