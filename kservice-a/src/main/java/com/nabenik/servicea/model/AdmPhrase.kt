package com.nabenik.servicea.model

import io.helidon.common.Reflected

@Reflected
data class AdmPhrase (
    var phraseId: Long? = null,
    var author: String? = null,
    var phrase: String? = null,
)