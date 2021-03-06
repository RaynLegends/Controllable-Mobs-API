package de.ntcomputer.minecraft.controllablemobs.api.ai;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.server.v1_8_R3.PathfinderGoal;
import net.minecraft.server.v1_8_R3.PathfinderGoalArrowAttack;
import net.minecraft.server.v1_8_R3.PathfinderGoalAvoidTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalBeg;
import net.minecraft.server.v1_8_R3.PathfinderGoalBreakDoor;
import net.minecraft.server.v1_8_R3.PathfinderGoalBreed;
import net.minecraft.server.v1_8_R3.PathfinderGoalDefendVillage;
import net.minecraft.server.v1_8_R3.PathfinderGoalEatTile;
import net.minecraft.server.v1_8_R3.PathfinderGoalFleeSun;
import net.minecraft.server.v1_8_R3.PathfinderGoalFloat;
import net.minecraft.server.v1_8_R3.PathfinderGoalFollowOwner;
import net.minecraft.server.v1_8_R3.PathfinderGoalFollowParent;
import net.minecraft.server.v1_8_R3.PathfinderGoalHurtByTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalInteract;
import net.minecraft.server.v1_8_R3.PathfinderGoalJumpOnBlock;
import net.minecraft.server.v1_8_R3.PathfinderGoalLeapAtTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalLookAtPlayer;
import net.minecraft.server.v1_8_R3.PathfinderGoalLookAtTradingPlayer;
import net.minecraft.server.v1_8_R3.PathfinderGoalMakeLove;
import net.minecraft.server.v1_8_R3.PathfinderGoalMeleeAttack;
import net.minecraft.server.v1_8_R3.PathfinderGoalMoveIndoors;
import net.minecraft.server.v1_8_R3.PathfinderGoalMoveThroughVillage;
import net.minecraft.server.v1_8_R3.PathfinderGoalMoveTowardsRestriction;
import net.minecraft.server.v1_8_R3.PathfinderGoalMoveTowardsTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalNearestAttackableTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalOcelotAttack;
import net.minecraft.server.v1_8_R3.PathfinderGoalOfferFlower;
import net.minecraft.server.v1_8_R3.PathfinderGoalOpenDoor;
import net.minecraft.server.v1_8_R3.PathfinderGoalOwnerHurtByTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalOwnerHurtTarget;
import net.minecraft.server.v1_8_R3.PathfinderGoalPanic;
import net.minecraft.server.v1_8_R3.PathfinderGoalPassengerCarrotStick;
import net.minecraft.server.v1_8_R3.PathfinderGoalPlay;
import net.minecraft.server.v1_8_R3.PathfinderGoalRandomLookaround;
import net.minecraft.server.v1_8_R3.PathfinderGoalRandomStroll;
import net.minecraft.server.v1_8_R3.PathfinderGoalRandomTargetNonTamed;
import net.minecraft.server.v1_8_R3.PathfinderGoalRestrictOpenDoor;
import net.minecraft.server.v1_8_R3.PathfinderGoalRestrictSun;
import net.minecraft.server.v1_8_R3.PathfinderGoalSit;
import net.minecraft.server.v1_8_R3.PathfinderGoalSwell;
import net.minecraft.server.v1_8_R3.PathfinderGoalTakeFlower;
import net.minecraft.server.v1_8_R3.PathfinderGoalTame;
import net.minecraft.server.v1_8_R3.PathfinderGoalTempt;
import net.minecraft.server.v1_8_R3.PathfinderGoalTradeWithPlayer;

/**
 * An enum that lists all AI components built into the minecraft server core.<br>
 * You can use it to specifically remove default AI parts by {@link de.ntcomputer.minecraft.controllablemobs.api.ControllableMobAI#remove(AIType...)} or {@link de.ntcomputer.minecraft.controllablemobs.api.ControllableMobAI#removeExcept(AIType...)}.<br>
 * It can be also used to identify AI parts on your own by using {@link AIPart#getType()}.
 * 
 * @author Cybran
 * @version v6
 *
 */
public enum AIType {
	ATTACK_RANGED(PathfinderGoalArrowAttack.class),
	MOVE_AVOIDPLAYER(PathfinderGoalAvoidTarget.class),
	ACTION_BEG(PathfinderGoalBeg.class),
	ACTION_DOORBREAK(PathfinderGoalBreakDoor.class),
	ACTION_BREED(PathfinderGoalBreed.class),
	ACTION_DEFENDVILLAGE(PathfinderGoalDefendVillage.class),
	ACTION_EATTILE(PathfinderGoalEatTile.class),
	MOVE_FLEESUN(PathfinderGoalFleeSun.class),
	MOVE_SWIM(PathfinderGoalFloat.class),
	MOVE_FOLLOWONWNER(PathfinderGoalFollowOwner.class),
	MOVE_FOLLOWPARENT(PathfinderGoalFollowParent.class),
	TARGET_HURTBY(PathfinderGoalHurtByTarget.class),
	ACTION_ENTITYINTERACT(PathfinderGoalInteract.class),
	MOVE_JUMPONBLOCK(PathfinderGoalJumpOnBlock.class),
	ATTACK_LEAP(PathfinderGoalLeapAtTarget.class),
	ACTION_ENTITYLOOK(PathfinderGoalLookAtPlayer.class),
	ACTION_PLAYERTRADINGLOOK(PathfinderGoalLookAtTradingPlayer.class),
	ACTION_LOVE(PathfinderGoalMakeLove.class),
	ATTACK_MELEE(PathfinderGoalMeleeAttack.class),
	MOVE_INDOORS(PathfinderGoalMoveIndoors.class),
	MOVE_VILLAGE(PathfinderGoalMoveThroughVillage.class),
	MOVE_RESTRICTED(PathfinderGoalMoveTowardsRestriction.class),
	MOVE_TARGET(PathfinderGoalMoveTowardsTarget.class),
	TARGET_NEAREST(PathfinderGoalNearestAttackableTarget.class),
	ATTACK_OCELOT(PathfinderGoalOcelotAttack.class),
	ACTION_FLOWEROFFER(PathfinderGoalOfferFlower.class),
	ACTION_DOOROPEN(PathfinderGoalOpenDoor.class),
	TARGET_OWNERATTACKER(PathfinderGoalOwnerHurtByTarget.class),
	TARGET_OWNERTARGET(PathfinderGoalOwnerHurtTarget.class),
	MOVE_PANIC(PathfinderGoalPanic.class),
	MOVE_FOLLOWCARROT(PathfinderGoalPassengerCarrotStick.class),
	ACTION_PLAY(PathfinderGoalPlay.class),
	ACTION_RANDOMLOOK(PathfinderGoalRandomLookaround.class),
	MOVE_RANDOMSTROLL(PathfinderGoalRandomStroll.class),
	TARGET_NEARESTNONTAMED(PathfinderGoalRandomTargetNonTamed.class),
	MOVE_RESTRICTOPENDOOR(PathfinderGoalRestrictOpenDoor.class),
	MOVE_RESTRICTSUN(PathfinderGoalRestrictSun.class),
	ACTION_SIT(PathfinderGoalSit.class),
	ATTACK_SWELL(PathfinderGoalSwell.class),
	ACTION_FLOWERTAKE(PathfinderGoalTakeFlower.class),
	ACTION_TAME(PathfinderGoalTame.class),
	ACTION_TEMPT(PathfinderGoalTempt.class),
	ACTION_PLAYERTRADE(PathfinderGoalTradeWithPlayer.class),
	UNKNOWN(null);
	
	private final Class<? extends PathfinderGoal> nmsPathfinderClass;
	
	private AIType(Class<? extends PathfinderGoal> pfgClass) {
		this.nmsPathfinderClass = pfgClass;
	}
	
	
	private static final Map<Class<? extends PathfinderGoal>,AIType> classTypeMap;
	
	static {
		classTypeMap = new HashMap<Class<? extends PathfinderGoal>,AIType>();
		for(AIType type: AIType.values()) {
			if(type!=AIType.UNKNOWN) classTypeMap.put(type.nmsPathfinderClass, type);
		}
	}
	
	/**
	 * You won't need this. But the API implementation will.
	 */
	public static AIType getTypeByInstance(PathfinderGoal goal) {
		if(classTypeMap.containsKey(goal.getClass())) return classTypeMap.get(goal.getClass());
		else return AIType.UNKNOWN;
	}

}
