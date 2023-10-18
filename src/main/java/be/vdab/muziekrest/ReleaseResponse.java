package be.vdab.muziekrest;

record ReleaseResponse(long id, int year, String title, Artist[] artists) {
}
