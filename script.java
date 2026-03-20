const text = document.getElementById("text").innerText;
const input = document.getElementById("input");

let startTime;

input.addEventListener("input", () => {

    if (!startTime) startTime = new Date();

    let typed = input.value;

    // Time
    let timeElapsed = (new Date() - startTime) / 60000;

    // WPM
    let wpm = Math.round((typed.length / 5) / timeElapsed);

    document.getElementById("wpm").innerText = wpm || 0;

    // Accuracy
    let correct = 0;
    for (let i = 0; i < typed.length; i++) {
        if (typed[i] === text[i]) correct++;
    }

    let accuracy = Math.round((correct / typed.length) * 100);
    document.getElementById("accuracy").innerText = accuracy || 100;

});
