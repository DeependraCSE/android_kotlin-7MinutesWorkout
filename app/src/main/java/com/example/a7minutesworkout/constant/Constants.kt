package com.example.a7minutesworkout.constant

import com.example.a7minutesworkout.model.ExerciseModel
import com.example.a7minutesworkout.R

object Constants {
    fun defaultExerciseList():ArrayList<ExerciseModel>{
        val exerciseList = ArrayList<ExerciseModel>()
        val jumpingJack = ExerciseModel(1, "Jumping Jack", R.drawable.ic_jumping_jacks, false, false)
        exerciseList.add(jumpingJack)
        val abdominal_crunch = ExerciseModel(2, "Abdominal Crunch", R.drawable.ic_abdominal_crunch, false, false)
        exerciseList.add(abdominal_crunch)
        val high_knees_running_in_place = ExerciseModel(3, "High Knees Running in Place", R.drawable.ic_high_knees_running_in_place, false, false)
        exerciseList.add(high_knees_running_in_place)
        val lunge = ExerciseModel(4, "Lunge", R.drawable.ic_lunge, false, false)
        exerciseList.add(lunge)
        val plank = ExerciseModel(5, "Plank", R.drawable.ic_plank, false, false)
        exerciseList.add(plank)
        val push_up = ExerciseModel(6, "Push Up", R.drawable.ic_push_up, false, false)
        exerciseList.add(push_up)
        val push_up_and_rotation = ExerciseModel(6, "Push Up and Rotation", R.drawable.ic_push_up_and_rotation, false, false)
        exerciseList.add(push_up_and_rotation)
        val side_plank = ExerciseModel(7, "Side Plank", R.drawable.ic_side_plank, false, false)
        exerciseList.add(side_plank)
        val squat = ExerciseModel(8, "Squat", R.drawable.ic_squat, false, false)
        exerciseList.add(squat)
        val step_up_onto_chair = ExerciseModel(9, "Step Up Onto Chair", R.drawable.ic_step_up_onto_chair, false, false)
        exerciseList.add(step_up_onto_chair)
        val triceps_dip_on_chair = ExerciseModel(10, "Triceps Dip On Chair", R.drawable.ic_triceps_dip_on_chair, false, false)
        exerciseList.add(triceps_dip_on_chair)
        val wall_sit = ExerciseModel(11, "Wall Sit", R.drawable.ic_wall_sit, false, false)
        exerciseList.add(wall_sit)

        return exerciseList
    }
}