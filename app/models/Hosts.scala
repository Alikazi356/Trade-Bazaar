package models

case class Host( id: String, name: String )

object Hosts {  
  def hosts(): List[ Host ] = {
    return List( new Host( "h1", "Daily" ), new Host( "h2", "Weekly" ), new Host("h3", "Monthly") )
  }	
}