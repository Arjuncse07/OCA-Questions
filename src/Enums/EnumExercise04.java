package Enums;

public class EnumExercise04 {

    public enum Planets{
        EARTH,MERCURY,VENUS,JUPITER,NEPTUNE,SATURN,PROXIMA_CENTAURI;


        public String getPlanetsInformation(){
            switch (this){
                case EARTH:
                    return "Earth is Green and Lovely Planet";
                case VENUS:
                    return "Venus is hottest planet";
                case JUPITER:
                    return "Largest Planet";
                case MERCURY:
                    return "Mercury is smallest planet";
                case NEPTUNE:
                    return "Neptune is Farthest Planet";
                case SATURN:
                    return "Saturn is Ringed Planet";
                case PROXIMA_CENTAURI:
                    return "PROXIMA_CENTAURI is nearest exoplanet";
                 default:
                    return "No Planet found";
            }

        }
    }

    public static String findPlanetInfo(Planets planets){
        return planets.getPlanetsInformation();
    }

    public static void main(String[] args) {
        Planets earthPlanet = Planets.EARTH;
        System.out.println(findPlanetInfo(earthPlanet));
    }

}
