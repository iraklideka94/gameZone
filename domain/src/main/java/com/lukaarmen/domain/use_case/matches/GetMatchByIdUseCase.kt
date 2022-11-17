package com.lukaarmen.domain.use_case.matches

import com.lukaarmen.domain.repository.MatchesRepository
import javax.inject.Inject

class GetMatchByIdUseCase @Inject constructor(
    private val matchesRepository: MatchesRepository
) {

    suspend operator fun invoke(matchId: Int) = matchesRepository.getMatchById(matchId)

}