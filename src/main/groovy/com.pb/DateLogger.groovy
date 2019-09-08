package com.pb

import java.time.LocalDate

class DateLogger {

    static logTheDate(file) {
        file.write("today is ${LocalDate.now().dayOfWeek}")
    }
}
