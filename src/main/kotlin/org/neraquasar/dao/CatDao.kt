package org.neraquasar.dao

import org.neraquasar.model.Cat
import org.springframework.data.jpa.repository.JpaRepository

interface CatDao : JpaRepository<Cat, Long>
