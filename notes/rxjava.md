https://rominirani.com/gradle-tutorial-part-1-installation-setup-2ea77729fc8c

https://www.baeldung.com/rx-java

https://www.androidhive.info/RxJava/map-flatmap-switchmap-concatmap/

https://android.jlelse.eu/rxjava-schedulers-what-when-and-how-to-use-it-6cfc27293add

Observable

    Observable provides data once subscriber starts listening.

    Observable can emit any number of items.

    Observable can emit only signal of completion as well with no item.

    Observable can terminate successfully.

    Observable may never terminate. e.g. a button can be clicked any number of times.

    Observable may throw error at any point of time.

Subscriber

    Observable can have multiple subscribers.

    When an Observable emits an item, each subscriber onNext() method gets invoked.

    When an Observable finished emitting items, each subscriber onComplete() method gets invoked.

    If an Observable emits error, each subscriber onError() method gets invoked.



Following are the base classes to create observables.

    Flowable − 0..N flows, Emits 0 or n items. Supports Reactive-Streams and back-pressure.

    Observable − 0..N flows ,but no back-pressure.

    Single − 1 item or error. Can be treated as a reactive version of method call.

    Completable − No item emitted. Used as a signal for completion or error. Can be treated as a reactive version of Runnable.

    MayBe − Either No item or 1 item emitted. Can be treated as a reactive version of Optional.

Following are the convenient methods to create observables in Observable class.

    just(T item) − Returns an Observable that signals the given (constant reference) item and then completes.

    fromIterable(Iterable source) − Converts an Iterable sequence into an ObservableSource that emits the items in the sequence.

    fromArray(T... items) − Converts an Array into an ObservableSource that emits the items in the Array.

    fromCallable(Callable supplier) − Returns an Observable that, when an observer subscribes to it, invokes a function you specify and then emits the value returned from that function.

    fromFuture(Future future) − Converts a Future into an ObservableSource.

    interval(long initialDelay, long period, TimeUnit unit) − Returns an Observable that emits a 0L after the initialDelay and ever increasing numbers after each period of time thereafter.



https://www.androidhive.info/RxJava/android-getting-started-with-reactive-programming/

Schedulers.io() – This is used to perform non CPU-intensive operations like making network calls, 
                  reading disc / files, database operations etc., This maintains pool of threads.


