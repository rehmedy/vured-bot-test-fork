package com.vacegaming.musicbot.reaction.control

import com.vacegaming.musicbot.reaction.Reaction
import com.vacegaming.musicbot.reaction.ReactionHandler
import net.dv8tion.jda.api.entities.Member

@Reaction(1, "U+23f8")
class PauseReaction: ReactionHandler {
    override fun execute(member: Member) {
        TODO("Not yet implemented")
    }
}
