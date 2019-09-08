package com.pb

class ExceptionThrowingClass {

    def doSomeWork() {

        throw new WorkException()


    }

}

class WorkException extends Exception {

    @Override
    String getMessage() {
        return "oops!"
    }
}
