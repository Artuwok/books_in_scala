package scala_for_impatient.chapter_09

import java.io.File

// Write a Scala program that counts how many files with .class extension are in a given directory
// and its subdirectories.
object Ex_09 extends App {


  val bigArray = recurciveScalaDirectoies(new File("/mnt/01D0AD212457E350/GoogleDrive/Programming/"))
  bigArray.filter(f => f.getName.endsWith(".scala")).foreach(println(_))

  def recurciveScalaDirectoies(x: File): Array[File] = {
    val these = x.listFiles
    these ++ these.filter(_.isDirectory).flatMap(recurciveScalaDirectoies)
  }

}
