import { NgHtmlPage } from './app.po';

describe('ng-html App', () => {
  let page: NgHtmlPage;

  beforeEach(() => {
    page = new NgHtmlPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
