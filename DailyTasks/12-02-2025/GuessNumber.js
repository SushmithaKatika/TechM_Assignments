
const randomNumber = Math.floor(Math.random() * 10) + 1;

        function checkGuess() {
            let userGuess = parseInt(document.getElementById("guess").value);
            let resultText = document.getElementById("result");

            if (userGuess === randomNumber) {
                resultText.innerHTML = "🎉 Good Work! You guessed it right.";
                resultText.style.color = "green";
            } else {
                resultText.innerHTML = `❌ Not matched! The correct number was ${randomNumber}.`;
                resultText.style.color = "red";
            }
        }