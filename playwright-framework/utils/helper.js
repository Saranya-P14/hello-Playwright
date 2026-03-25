async function login(page, user, pass) {
  await page.fill('#username', user);
  await page.fill('#password', pass);
  await page.click('#login');
}
