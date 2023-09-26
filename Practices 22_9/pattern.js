let a = 5;

for (let i = 0; i < a; i++) {
    let stars = "";
    let hashes = "";

    for (let j = 0; j <= i; j++) {
        stars += "*";
    }

    for (let k = a - i - 1; k > 0; k--) {
        hashes += "#";
    }

    console.log(stars + hashes);
}
