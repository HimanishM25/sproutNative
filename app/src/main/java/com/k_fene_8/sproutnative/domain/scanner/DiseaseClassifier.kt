package com.k_fene_8.sproutnative.domain.scanner

import android.graphics.Bitmap

interface DiseaseClassifier {
    fun classify(bitmap: Bitmap, rotation: Int): List<Classification>
}