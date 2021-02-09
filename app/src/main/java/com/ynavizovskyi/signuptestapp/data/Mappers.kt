package com.ynavizovskyi.signuptestapp.data

import com.ynavizovskyi.signuptestapp.doman.entity.Session

fun SessionData.toDomain() = Session(token)