import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Singleton

class WorkingComponent @Inject constructor(val a: Int) {

    @Singleton
    @Component(modules = [WorkingComponentModule::class])
    interface Factory {
        fun create(): WorkingComponent
    }

    @Module
    class WorkingComponentModule(@get:Provides val a: Int)
}