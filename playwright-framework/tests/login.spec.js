const { test, expect } = require('@playwright/test');

test('valid login', async ({ page }) => {
  await page.goto('https://example.com');

  await page.fill('#username', 'test');
  await page.fill('#password', 'password');
  await page.click('#login');

  await expect(page).toHaveTitle(/Dashboard/);
});
