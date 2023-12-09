class Sport {
    public String getName() {
        return "General Sport";
    }

    public String getNumberOfTeamMembers() {
        return "Each team has n players in " + getName();
    }
}

class Soccer extends Sport {
    @Override
    public String getName() {
        return "Soccer";
    }

    @Override
    public String getNumberOfTeamMembers() {
        return "Each team has 11 players in " + getName();
    }
}